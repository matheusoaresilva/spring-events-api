package br.com.soares.events.service;

import br.com.soares.events.entity.Session;
import br.com.soares.events.repo.SessionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements ISessionService{

    private SessionRepo repo;

    public SessionServiceImpl(SessionRepo repo) {
        this.repo = repo;
    }

    @Override
    public Session addSessions(Session session) {
        return repo.save(session);
    }

    @Override
    public List<Session> getAllSessions(Session s) {
        return repo.findAll();
    }

    @Override
    public List<Session> getSessionById(Integer id) {
        return repo.findByIdSession(id);
    }
}
