package br.com.schelperapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/helloworld")
public class HelloWorldResource {

	@GetMapping
	public ResponseEntity<String> findAll(){					
		return ResponseEntity.ok().body("Hello World");		
	}
	
}
