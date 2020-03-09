package com.compliment.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/compliment")
public class ComplimentController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getCompliment(ModelMap model) {
        return "MyCompliment";
    }

}
