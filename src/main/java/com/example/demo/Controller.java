package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "/exposed")
    public String exposed(){
        return "exposed";
    }

    @RequestMapping(path ="/internal")
    public String internal(){
        return "internal";
    }
}
