package br.com.soares.events.controller;

import br.com.soares.events.entity.Session;
import br.com.soares.events.service.ISessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SessionController {

    private ISessionService service;

    public SessionController(ISessionService service) {
        this.service = service;
    }

    @PostMapping("/sessions")
    public ResponseEntity<Session> addSession(@RequestBody Session session){
        return ResponseEntity.status(201).body(service.addSessions(session));
    }

    @GetMapping("/sessions/{id}")
    public ResponseEntity<List<Session>> getSessionById(@PathVariable Integer id){
        Session session = new Session();
        return ResponseEntity.ok(service.getSessionById(id));
    }
}
