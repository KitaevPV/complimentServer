package com.compliment.server.controller;

import com.compliment.server.entity.Compliment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/compliment")
public class ComplimentController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Compliment getCompliment() {
        return createMockCompliment();
    }

    private Compliment createMockCompliment() {
        Compliment compliment = new Compliment();
        compliment.setId(1);
        compliment.setComplimentDate(new Date());
        compliment.setTitle("First compliment");

        return compliment;
    }

}
