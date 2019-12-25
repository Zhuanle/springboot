package com.example.user.controller;



import com.example.common.pojo.User;
import com.example.user.mapper.TestMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 *
 */


@RestController public class TestController {

  @Autowired TestMapper testMapper;

  @RequestMapping("/addUser") public void add(@RequestBody User user) {

    try {
      testMapper.add(user);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @RequestMapping("/listUser")
  public PageInfo list(Model m, @RequestParam(value = "start", defaultValue = "0") int start,
      @RequestParam(value = "size", defaultValue = "5") int size) {
    PageHelper.startPage(start, size);
    List<User> list = testMapper.listTest();
    PageInfo<User> page = new PageInfo<>(list);
    return page;
  }
}
