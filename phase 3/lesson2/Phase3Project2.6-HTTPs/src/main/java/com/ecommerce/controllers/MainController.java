package com.ecommerce.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
         
         @GetMapping("/")
          public String welcome() {
               

            return "This is running under SSL";
          }
         
        
}

