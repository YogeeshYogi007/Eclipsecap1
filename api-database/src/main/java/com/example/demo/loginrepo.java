package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface loginrepo extends JpaRepository<DAO, Integer>{

	public DAO findByusername();

	public Optional<Object> deleteByusername(String username);

	public void save(String username);

}
