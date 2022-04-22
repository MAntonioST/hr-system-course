package br.com.marcot.userapi;

import br.com.marcot.userapi.domain.User;
import br.com.marcot.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       userRepository.saveAll(List.of(
			   new User(null,"Marco Teixeira","marcot@unicid.edu.br", "123",20.0),
			   new User(null,"Thiago Dailly","thiago@&t&t.google.com", "124",30.0)
	   ));
	}
}
