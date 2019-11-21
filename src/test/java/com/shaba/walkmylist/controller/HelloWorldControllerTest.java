package com.shaba.walkmylist.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.shaba.walkmylist.service.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

  @Autowired private MockMvc mockMvc;
  @MockBean private HelloWorldService helloWorldService;

  @Test
  public void shouldReturnJson() throws Exception {
    when(helloWorldService.getHello()).thenReturn("Hi!");
    mockMvc.perform(get("/hello-world")).andExpect(status().isOk());
  }
}
