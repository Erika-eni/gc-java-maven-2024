package com.geracaocaldeira.java.Aula13.exemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCOntroller {

    @GetMapping("/demo-get")
    public String get(){
        return "joaquim chatão";
    }
}
