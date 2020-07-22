package com.rohanmorris.nova.Repo;

import java.util.Optional;
import com.rohanmorris.nova.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User, Long> {
    Optional<User> findByusername(String username);
}