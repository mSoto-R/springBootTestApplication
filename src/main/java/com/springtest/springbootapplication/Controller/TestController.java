package com.springtest.springbootapplication.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Map<String, Object> model) {
        model.put("Titulo", "Test is working!");
        return "test";
    }
}
