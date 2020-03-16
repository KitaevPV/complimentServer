package com.compliment.server.controller;

import com.compliment.server.entity.Compliment;
import com.compliment.server.repository.ComplimentRepository;
import com.compliment.server.service.ComplimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ComplimentController {

    @Autowired
    private ComplimentService service;

    @RequestMapping(value = "/compliments", method = RequestMethod.GET)
    @ResponseBody
    public List<Compliment> getAllCompliments() {
        return service.getAll();
    }

    @RequestMapping(value = "/compliments/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Compliment getCompliment(@PathVariable Long id) {
        return service.getByID(id);
    }

    @RequestMapping(value = "/compliments", method = RequestMethod.POST)
    @ResponseBody
    public Compliment saveCompliment(@RequestBody Compliment compliment) {
        return service.save(compliment);
    }

    @RequestMapping(value = "/compliments/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteCompliment(@PathVariable Long id) {
        service.remove(id);
    }

}
