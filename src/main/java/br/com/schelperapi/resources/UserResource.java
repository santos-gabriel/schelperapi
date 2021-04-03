package br.com.schelperapi.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.schelperapi.domain.User;
import br.com.schelperapi.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	@RequestMapping(value = "/findAll")
	public ResponseEntity<List<User>> findAllUsers() throws Exception{					
		List<User> users = (List<User>) userService.findAll();		
		return ResponseEntity.ok().body(users.stream().collect(Collectors.toList()));
	}
	
	@GetMapping
	@RequestMapping(value = "/findByUsernameAndPassword")
	public ResponseEntity<List<User>> findByLoginAndPassword(@RequestBody User user) throws Exception{
		List<User> users = userService.findByLoginAndPassword(user);
		return ResponseEntity.ok().body(users.stream().collect(Collectors.toList()));
	}
	
}
