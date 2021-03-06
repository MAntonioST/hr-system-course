package br.com.marcot.userapi.resources;

import br.com.marcot.userapi.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserResource {

    @GetMapping(value = "/{id}")
    ResponseEntity<User> findBuId(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();
}
