package com.example.demo.patternmatching;

public sealed interface WebService permits RestfulService, DBService{

    String execute(String body);
}
