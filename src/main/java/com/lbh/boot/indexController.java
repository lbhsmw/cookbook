package com.lbh.boot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class indexController {

    @RequestMapping("/")
    public String Helloindex(){
         return "HEllo, I am SpringBoot";
    }
}
