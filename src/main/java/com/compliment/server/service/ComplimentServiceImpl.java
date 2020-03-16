package com.compliment.server.service;

import com.compliment.server.entity.Compliment;
import com.compliment.server.repository.ComplimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplimentServiceImpl implements ComplimentService {

@Autowired
private ComplimentRepository repository;

@Override
public List<Compliment> getAll() {
        return repository.findAll();
        }


@Override
public Compliment getByID(Long id) {
        return repository.findOne(id);
        }

@Override
public Compliment save(Compliment compliment) {
        return repository.saveAndFlush(compliment);
        }

@Override
public void remove(Long id) {
        repository.delete(id);
        }

}
