package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {

  @Test
  void helloReturnsMessage() {
    HelloController controller = new HelloController();
    assertThat(controller.hello()).isEqualTo("Hello from Spring Boot!");
  }
}
