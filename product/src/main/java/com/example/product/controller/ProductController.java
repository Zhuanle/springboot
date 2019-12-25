package com.example.product.controller;

import com.example.common.pojo.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController public class ProductController {

  @Autowired ProductService productService;

  @RequestMapping("/addProduct") public void add(@RequestBody Product product) {
    productService.add(product);
  }

  @RequestMapping("/listProduct") public List<Product> list() {
    return productService.list();
  }
}
