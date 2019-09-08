package com.example.sonarclouddemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @RequestMapping(value = "add")
    public ResponseEntity<String> capital(@RequestParam("test")String text){
        String result = text.toUpperCase();
        return ResponseEntity.ok(result);
    }
}
