package com.lifedefender.lifedefender;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basinController {

    @GetMapping("/123")
    public String test(){
        return "dasd";
    }
}
