package com.backend.login;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface aRepoitory  extends JpaRepository<Allergens, String>{

	List<Allergens> findByPeanuts(String peanut);

	void deleteByPeanuts(String peanuts);

}
