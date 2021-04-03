package br.com.schelperapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.schelperapi.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	
	@Query(value = "SELECT * FROM users WHERE login = ?1 AND password = ?2", nativeQuery = true)
	List<User> findByLoginAndPassword(String login, String password);
	
}
