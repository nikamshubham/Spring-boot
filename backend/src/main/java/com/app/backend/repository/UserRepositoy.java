package com.app.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.backend.model.User;

//@Repository
public interface UserRepositoy extends JpaRepository<User, Long>{
	
}
