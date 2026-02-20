package br.com.soares.events.repo;

import br.com.soares.events.entity.Session;
import br.com.soares.events.entity.Subscription;
import br.com.soares.events.entity.SubscriptionID;
import br.com.soares.events.entity.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByIdUser(User user);
    public  Subscription findById(Integer id);
}
