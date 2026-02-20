package br.com.soares.events.controller;

import br.com.soares.events.entity.Session;
import br.com.soares.events.entity.Subscription;
import br.com.soares.events.entity.User;
import br.com.soares.events.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SubscriptionController {

    private ISubscriptionService service;

    public SubscriptionController(ISubscriptionService service) {
        this.service = service;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(service.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{id}")
    public ResponseEntity<List<Subscription>> getByUser(@PathVariable Integer id){
        User user = new User();
        user.setUserId(id);
        return ResponseEntity.ok(service.getAllByUser(user));

    }

    @GetMapping("/subscriptions/session/{id}")
    public ResponseEntity <Subscription> getSubscriptionById (@PathVariable Integer id){
        Subscription subscription = service.getSubscriptionById(id);
        return ResponseEntity.ok().body(subscription);
    }
}
