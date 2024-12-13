package com.xdlab.service;

import com.xdlab.model.Speaker;
import com.xdlab.repository.ISpeakerRepository;
import com.xdlab.repository.StubSpeakerRepository;

import java.util.List;

public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository repository = new  StubSpeakerRepository();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
