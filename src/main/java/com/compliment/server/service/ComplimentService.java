package com.compliment.server.service;

import com.compliment.server.entity.Compliment;

import java.util.List;

public interface ComplimentService {

    List<Compliment> getAll();
    Compliment getByID(Long id);
    Compliment save(Compliment compliment);
    void remove(Long id);

}
