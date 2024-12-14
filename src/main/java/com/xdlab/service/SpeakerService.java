package com.xdlab.service;

import com.xdlab.model.Speaker;
import com.xdlab.repository.ISpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository repository;

    public SpeakerService(){
        System.out.println("SpeakerService no args constructor");
    }

    public SpeakerService(ISpeakerRepository repository) {
        System.out.println("SpeakerService repository constructor");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    //autowired
    @Autowired
    public void setRepository(ISpeakerRepository repository) {
        System.out.println("SpeakerService setter");
        this.repository = repository;
    }
}
