package com.shaba.walkmylist.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HelloWorldServiceTest {

  private HelloWorldService service = new HelloWorldService();

  @Test
  public void hello() {
    assertThat(service.getHello()).isEqualTo("Hello, World!");
  }
}
