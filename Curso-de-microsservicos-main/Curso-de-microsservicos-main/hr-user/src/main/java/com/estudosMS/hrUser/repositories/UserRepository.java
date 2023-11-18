package com.estudosMS.hrUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosMS.hrUser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
