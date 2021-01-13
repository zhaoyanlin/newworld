package com.project.newworld.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: Student
 * @date: 2021/1/12 上午11:24
 * @author: zhaoyanlin
 * @version: 1.0
 */

@Data
@AllArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
