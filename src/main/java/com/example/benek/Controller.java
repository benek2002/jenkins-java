package com.example.benek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String hello(){
        return "Hello User!";
    }
    @GetMapping("/substraction/{a}/{b}")
    public Double substraction(@PathVariable Double a, @PathVariable Double b){
        return a - b;
    }

    @GetMapping("/addition/{a}/{b}")
    public Double addition(@PathVariable Double a, @PathVariable Double b){
        return a + b;
    }

    @GetMapping("/multiplication/{a}/{b}")
    public Double multiplication(@PathVariable Double a, @PathVariable Double b){
        return a * b;
    }

    @GetMapping("/division/{a}/{b}")
    public Double division(@PathVariable Double a, @PathVariable Double b){
        return a/b;
    }
}
