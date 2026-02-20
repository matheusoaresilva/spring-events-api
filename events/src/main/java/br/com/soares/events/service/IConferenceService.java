package br.com.soares.events.service;

import br.com.soares.events.entity.Conference;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IConferenceService{
    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAllConferences();

}
