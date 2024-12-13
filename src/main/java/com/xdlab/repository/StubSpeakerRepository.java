package com.xdlab.repository;

import com.xdlab.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepository implements ISpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Murat");
        speaker.setLastName("Seker");

        speakers.add(speaker);

        return speakers;
    }
}
