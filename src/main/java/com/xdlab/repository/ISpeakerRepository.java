package com.xdlab.repository;

import com.xdlab.model.Speaker;

import java.util.List;

public interface ISpeakerRepository {
    List<Speaker> findAll();
}
