package com.backend.login;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UIService {
	
	@Autowired
	private UIRepository uirepo;
	
	
	public UserInfo create(UserInfo ui) {
		return uirepo.save(ui);
	}
	
	public UserInfo update(UserInfo ui) {
		return uirepo.save(ui);
	}
	
	public UserInfo get(int userid) {
		 Optional<UserInfo> optionalUI = uirepo.findById(userid);
	        if (optionalUI.isPresent()) {
	            return optionalUI.get();
	        }
	        return null;
	}
	
	public void delete(int userid) {
		uirepo.deleteById(userid);
	}

	public List<UserInfo> getAllUserinfo() {
		return uirepo.findAll();
	}

	public List<UserInfo> findByemailId(String emailId) {
		// TODO Auto-generated method stub
		return uirepo.findByemailId(emailId);
	}

}
