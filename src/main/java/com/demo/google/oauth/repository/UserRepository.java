package com.demo.google.oauth.repository;

import com.demo.google.oauth.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

	Users findByUsername(String username);

}
