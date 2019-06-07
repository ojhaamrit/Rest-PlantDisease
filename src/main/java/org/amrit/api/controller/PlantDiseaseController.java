package org.amrit.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantDiseaseController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "hello " + name + " !";
    }
}
