package io.springsecurity.springsecurityjpa.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springsecurity.springsecurityjpa.models.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	Optional<User> findByUserName(String userName);
}
