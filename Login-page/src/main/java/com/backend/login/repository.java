package com.backend.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<UserCredential, Integer> {

	UserCredential findbyEmail(String emailId);

}
