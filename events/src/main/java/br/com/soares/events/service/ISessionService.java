package br.com.soares.events.service;

import br.com.soares.events.entity.Session;

import java.util.List;

public interface ISessionService  {
    public Session addSessions(Session session);
    public List<Session> getAllSessions(Session s);
    public List<Session> getSessionById(Integer id);
}
