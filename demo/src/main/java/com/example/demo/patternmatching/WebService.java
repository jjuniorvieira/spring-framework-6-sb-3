package com.example.demo.patternmatching;

import org.springframework.stereotype.Controller;

@Controller
public sealed interface WebService permits RestfulService, DBService{

    String execute(String body);
}
