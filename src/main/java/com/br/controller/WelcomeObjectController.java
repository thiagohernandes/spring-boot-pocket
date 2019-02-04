package com.br.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.model.WelcomeBean;

@RestController
public class WelcomeObjectController {
	
	@GetMapping("/welcome-with-object")
    public WelcomeBean welcomeWithObject() {
      return new WelcomeBean("Hello World object");
    }

}
