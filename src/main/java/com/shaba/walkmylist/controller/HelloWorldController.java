package com.shaba.walkmylist.controller;

import com.shaba.walkmylist.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  private HelloWorldService helloWorldService;

  public HelloWorldController(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

  @GetMapping("/hello-world")
  public String helloWorld() {
    return helloWorldService.getHello();
  }
}
