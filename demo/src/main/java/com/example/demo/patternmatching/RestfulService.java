package com.example.demo.patternmatching;

import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;


@RestController
public final class RestfulService implements WebService {

    private final HttpServletRequest httpServletRequest;

    public RestfulService(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Override
    public String execute(String body) {
        return "";
    }
}
