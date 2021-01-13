package com.project.newworld.controller;

import com.project.newworld.domain.Student;
import com.project.newworld.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: Test
 * @date: 2021/1/12 上午10:15
 * @author: zhaoyanlin
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class Test {

    @Autowired
    public TestMapper testMapper;

    @RequestMapping("/test")
    public List<Student> test(){
        log.info("测试");
        List<Student> su = testMapper.select();
        return su;
    }
}
