package com.interview.prep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class controller {

    @GetMapping
    public String defaultController() {
        return "basic authenticated!!!";
    }
}
