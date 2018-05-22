package com.example.demo.controller;

import com.example.demo.domain.FizzBuzz;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fizz-buzz")
public class FizzBuzzController {

    @RequestMapping(value = "/{number}", method = RequestMethod.GET)
    public String getFizzBuzz(@PathVariable int number){
        return FizzBuzz.fizzBuzz(number);
    }
}
