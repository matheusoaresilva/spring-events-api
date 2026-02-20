package br.com.soares.events.repo;

import br.com.soares.events.entity.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepo extends ListCrudRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
}
