package br.com.soares.events.service;

import br.com.soares.events.entity.Session;
import br.com.soares.events.entity.Subscription;
import br.com.soares.events.entity.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);

}
