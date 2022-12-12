package com.backend.login;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UCService {
	@Autowired
	private UIRepository uirepo;
	
	@Autowired
	private UCRepository ucrepo;
	
	
	public UserCredential create(UserCredential uc) {
		return ucrepo.save(uc);
	}
	
	public UserCredential update(UserCredential uc) {
		return ucrepo.save(uc);
	}
	
	public UserCredential get(int id) {
		 Optional<UserCredential> optionalUC = ucrepo.findById(id);
	        if (optionalUC.isPresent()) {
	            return optionalUC.get();
	        }
	        return null;
	}
	
	public void delete(int id) {
		ucrepo.deleteById(id);
	}

	public List<UserCredential> getAllUserCredentail() {
		return ucrepo.findAll();
	}
	
	public List<UserCredential> findByemailId(String emailId){
		return ucrepo.findByemailId(emailId);
		
	}

}
