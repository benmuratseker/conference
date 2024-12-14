package com.xdlab.service;

import com.xdlab.model.Speaker;
import com.xdlab.repository.ISpeakerRepository;

import java.util.List;

public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository repository;

    public SpeakerService(ISpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(ISpeakerRepository repository) {
        this.repository = repository;
    }
}
