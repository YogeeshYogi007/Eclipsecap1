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
public class UIController {
	
	@Autowired
	private UIService uis;
	@Autowired
	private UCService ucs;
	
    @PostMapping(consumes = "application/json", produces = "application/json", path = "/UI/{emailId}")
    public ResponseEntity<UserInfo> createUser(@RequestBody UserInfo ui,@PathVariable(value = "emailId") String emailId) {
    
			List<UserCredential> list = ucs.findByemailId(emailId);
			List<UserInfo> list1 = uis.findByemailId(emailId);
			if(!list.equals(list1)) {
			return new ResponseEntity<>(uis.create(ui), HttpStatus.CREATED);}
			else {
				return new ResponseEntity<UserInfo>(HttpStatus.ALREADY_REPORTED);
			}
    }
    
    @PutMapping(consumes = "application/json", produces = "application/json", path = "/UI")
    public ResponseEntity<UserInfo> updateUser(@RequestBody UserInfo ui) {
        return new ResponseEntity<>(uis.update(ui), HttpStatus.CREATED);
    }
    
    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/UI/{userid}")
    public ResponseEntity<String> deleteUser(@PathVariable(value = "userid") int userid) {
        uis.delete(userid);
        return new ResponseEntity<>("User with UserID : " + userid + " deleted successfully", HttpStatus.OK);
    }
    
    @GetMapping(path = "/UI/{userid}", produces = "application/json")
    public ResponseEntity<UserInfo> getEmployee(@PathVariable(value = "userid") int userid) {
        return new ResponseEntity<>(uis.get(userid), HttpStatus.OK);
    }
	
    @GetMapping(path = "/UI", produces = "application/json")
    public ResponseEntity<List<UserInfo>> getAllUsers() {
        return new ResponseEntity<>(uis.getAllUserinfo(), HttpStatus.OK);
    }
	

}
