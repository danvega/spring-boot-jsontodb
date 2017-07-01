package com.therealdanvega.repository;

import com.therealdanvega.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {



}
