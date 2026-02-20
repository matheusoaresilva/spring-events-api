package br.com.soares.events.controller;

import br.com.soares.events.entity.Conference;
import br.com.soares.events.service.IConferenceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Repeatable;
import java.util.List;

@RestController
public class ConferenceController {

    private IConferenceService service;

    public ConferenceController(@Qualifier("conferenceServiceImpl") IConferenceService service) {
        this.service = service;
    }

    @PostMapping("/conferences")
    public ResponseEntity<Conference> addConference(@RequestBody Conference conference){
        service.addConference(conference);
        return ResponseEntity.status(201).body(service.addConference(conference));
    }

    @GetMapping("/conferences")
    public ResponseEntity<List<Conference>> getAllConferences(){
        return ResponseEntity.ok(service.getAllConferences());
    }

    @GetMapping("/conferences/{id}")
    public ResponseEntity<Conference> getById(@PathVariable Integer id){
        Conference conference = new Conference();
        conference.setId(id);
        return ResponseEntity.ok().body(service.getConferenceById(id));
    }

//    @GetMapping("/conferences/{name}")
//    public ResponseEntity<Conference> getByName(@PathVariable(name = "name") String name){
//        Conference conference = new Conference();
//        conference.setName(name);
//        return ResponseEntity.ok().body(service.getConferenceByName(name));
//    }

}
