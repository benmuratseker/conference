package com.xdlab.repository;

import com.xdlab.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
//this eliminates the bean in config
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
