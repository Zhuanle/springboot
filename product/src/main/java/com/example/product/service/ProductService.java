package com.example.product.service;

import com.example.common.pojo.Product;

import com.example.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service public class ProductService {

  @Autowired ProductMapper productMapper;

  public void add(Product product) {
    productMapper.add(product);
  }

  public List<Product> list() {
    return productMapper.list();
  }
}
