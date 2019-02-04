package com.br.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
  @GetMapping("/welcome")
  public String Welcome() {
    return "Hello World - I´m alive!";
  }
}