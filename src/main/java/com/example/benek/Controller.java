package com.example.benek;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping
    @CrossOrigin
    public String hello(){
        return "Hello Kubernates User!";
    }
    @GetMapping("/substraction/{a}/{b}")
    @CrossOrigin
    public Double substraction(@PathVariable Double a, @PathVariable Double b){
        return a - b;
    }

    @GetMapping("/addition/{a}/{b}")
    @CrossOrigin
    public Double addition(@PathVariable Double a, @PathVariable Double b){
        return a + b;
    }

    @GetMapping("/multiplication/{a}/{b}")
    @CrossOrigin
    public Double multiplication(@PathVariable Double a, @PathVariable Double b){
        return a * b;
    }

    @GetMapping("/division/{a}/{b}")
    @CrossOrigin
    public Double division(@PathVariable Double a, @PathVariable Double b){
        return a/b;
    }
}
