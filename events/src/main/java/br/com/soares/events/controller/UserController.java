package br.com.soares.events.controller;

import br.com.soares.events.entity.User;
import br.com.soares.events.service.IUserService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import java.util.List;

@RestController
public class UserController {

    private IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        service.addUser(user);
        return ResponseEntity.status(201).body(service.addUser(user));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
        User user = service.getUserById(id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/users")
    public ResponseEntity <List<User>> getAllUsers(User user){
        return ResponseEntity.ok(service.getAllUsers());
    }

}
