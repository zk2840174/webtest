package org.zerock.webtest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webtest/")
public class SampleController {

    @GetMapping("")
    public String[] doA() {
        return new String[]{"AAA","BBB","CCC"};
    }


    @GetMapping("/doB")
    public String[] doB() {
        return new String[]{"AAA","BBB","CCC"};
    }
}
