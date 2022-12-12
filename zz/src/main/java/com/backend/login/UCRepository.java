package com.backend.login;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UCRepository extends JpaRepository<UserCredential, Integer> {

	List<UserCredential> findByemailId(String emailId);


}
