package com.analistas.trabajo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.analistas.trabajo.Domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
