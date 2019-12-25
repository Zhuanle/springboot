package com.example.product.mapper;

import com.example.common.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper public interface ProductMapper {
  public void add(Product product);

  public void update(Product product);

  public List<Product> list();

}
