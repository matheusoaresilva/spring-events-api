package br.com.soares.events.service;

import br.com.soares.events.entity.Conference;
import br.com.soares.events.exception.NotFoundException;
import br.com.soares.events.repo.ConferenceRepo;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;


@Service
public class ConferenceServiceImpl implements IConferenceService{

    private ConferenceRepo repo;

    public ConferenceServiceImpl(ConferenceRepo repo) {
        this.repo = repo;
    }

    @Override
    public Conference addConference(Conference conference) {
        return repo.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {

        return repo.findById(id).orElseThrow(() -> new NotFoundException("conference "+ id +" not found."));
    }

    @Override
    public Conference getConferenceByName(String name) {
        return repo.findByName(name);
    }



}
