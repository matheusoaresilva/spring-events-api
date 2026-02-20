package br.com.soares.events.repo;

import br.com.soares.events.entity.Session;
import br.com.soares.events.entity.Subscription;
import br.com.soares.events.entity.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {
    public List<Session> findByIdSession(Integer id);
}
