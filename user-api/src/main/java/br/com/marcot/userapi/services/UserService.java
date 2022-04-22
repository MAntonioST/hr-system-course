package br.com.marcot.userapi.services;

import br.com.marcot.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
