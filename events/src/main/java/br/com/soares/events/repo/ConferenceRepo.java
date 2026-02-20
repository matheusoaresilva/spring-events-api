package br.com.soares.events.repo;

import br.com.soares.events.entity.Conference;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {
    public Conference findConferenceById(Integer id);
    public Conference findByName(String name);
}
