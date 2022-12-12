package com.backend.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UCController {
	
	@Autowired
	private UCService ucs;
	
    @PostMapping(consumes = "application/json", produces = "application/json", path = "/UC")
    public ResponseEntity<UserCredential> createUserCredentianl(@RequestBody UserCredential uc) {
        return new ResponseEntity<>(ucs.create(uc), HttpStatus.CREATED);
    }
    
    @PutMapping(consumes = "application/json", produces = "application/json", path = "/UC")
    public ResponseEntity<UserCredential> updateUserCredentianl(@RequestBody UserCredential uc) {
        return new ResponseEntity<>(ucs.update(uc), HttpStatus.CREATED);
    }
    
    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/UC/{id}")
    public ResponseEntity<String> deleteUserCredentianl(@PathVariable(value = "userid") int id) {
        ucs.delete(id);
        return new ResponseEntity<>("UserCredential with UserID : " + id + " deleted successfully", HttpStatus.OK);
    }
    
    @GetMapping(path = "/UC/{id}", produces = "application/json")
    public ResponseEntity<UserCredential> getEmployeeCredentianl(@PathVariable(value = "id") int id) {
        return new ResponseEntity<>(ucs.get(id), HttpStatus.OK);
    }
	
    @GetMapping(path = "/UC", produces = "application/json")
    public ResponseEntity<List<UserCredential>> getAllUsersCredentianl() {
        try {
			return new ResponseEntity<>(ucs.getAllUserCredentail(), HttpStatus.OK);
		} catch (Exception e) {
		return new ResponseEntity<List<UserCredential>>(HttpStatus.NOT_FOUND);
		}
    }
    
   
    
    
	
}
