package com.example.user.mapper;


import org.apache.ibatis.annotations.Mapper;
import com.example.common.pojo.User;

import java.util.List;

@Mapper public interface TestMapper {
  public void add(User test);

  public List<User> listTest();
}
