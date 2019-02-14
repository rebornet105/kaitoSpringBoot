package com.vocaloid.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: 李翰南
 * @create: 2019年02月14日 11:16
 * @version:
 */
@Component
@PropertySource("classpath:my2.properties")
@ConfigurationProperties(prefix = "my2")
public class MyProperties2 {
  private int age;
  private String name;
  private String email;
  // 省略 get set

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "MyProperties2{" +
        "age=" + age +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
