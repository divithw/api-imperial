package com.example.imperial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Implementation i = new Implementation();

    @RequestMapping("/ouncesToGram")

    public double ouncesToGram(@RequestParam double oz){
        return i.ouncesToGram(oz);
    }



}
