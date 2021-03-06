package com.example.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.product.mapper")
@SpringBootApplication public class ProductApplication {

  public static void main(String[] args) {

    SpringApplication.run(ProductApplication.class, args);
  }

}
