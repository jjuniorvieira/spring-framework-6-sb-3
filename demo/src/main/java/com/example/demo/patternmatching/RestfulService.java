package com.example.demo.patternmatching;

import jakarta.inject.Inject;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;


@RestController
public final class RestfulService implements WebService {

    private HttpServletRequest httpServletRequest;

    public RestfulService(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Inject
    public void setHttpServletRequest(HttpServletRequest httpServletRequest){
        this.httpServletRequest = httpServletRequest;
    }

    @Override
    public String execute(String body) {
        return "";
    }
}
