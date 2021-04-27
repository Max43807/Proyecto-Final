package com.analistas.trabajo.Repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.analistas.trabajo.Domain.User;

@Repository
public interface UserRepositorty extends CrudRepository<User, Long> {

	public Optional<User> findByUsername(String username);
}
