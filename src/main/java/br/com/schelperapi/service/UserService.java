package br.com.schelperapi.service;

import java.util.List;

import br.com.schelperapi.domain.User;

public interface UserService {
	
	List<User> findAll();
	
	List<User> findByLoginAndPassword(User user);
	
}
