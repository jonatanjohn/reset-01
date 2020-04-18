package br.com.cwi.reset.tinderapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TinderApiController {

    @GetMapping("/verify")
    public HttpStatus verify(){
        return HttpStatus.OK;

    }
}
