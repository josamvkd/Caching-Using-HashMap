package com.josamtechie.springbootdemo.controller;

import com.josamtechie.springbootdemo.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/request")
public class CacheController {

    @Autowired
    private CacheService service;

    @PostMapping
    public String postRequest(){
      return service.postMethod();
    }
}
