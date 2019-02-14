package com.vocaloid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@SpringBootApplication
public class HatsunekaitoApplication {

  public static void main(String[] args) {
    SpringApplication.run(HatsunekaitoApplication.class, args);
  }

  @GetMapping("/welcome")
  public String welcome() {
    return "Hello Vocaloid HatsuneKaito";
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    // 目的是
    return args -> {
      System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
      String[] beanNames = ctx.getBeanDefinitionNames();
      Arrays.sort(beanNames);
      Arrays.stream(beanNames).forEach(System.out::println);
    };
  }
}

