package com.vocaloid.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: 李翰南
 * @create: 2019年02月13日 11:07
 * @version:
 */
@Component
@ConfigurationProperties(prefix = "my1")
public class MyProperties1 {
  private int age;
  private String name;

  @Override
  public String toString() {
    return "MyProperties1{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }

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
}
