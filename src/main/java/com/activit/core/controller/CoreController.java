package com.activit.core.controller;

import com.activit.core.enity.ManInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/core")
public class CoreController {

    @Autowired
    private ManInfoProperties manInfoProperties;

    @RequestMapping("hello")
    public String testRetString(){
        return "success";
    }

}
