package com.backend.login;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UIRepository extends JpaRepository<UserInfo, Integer> {

	List<UserInfo> findByemailId(String emailId);

}
