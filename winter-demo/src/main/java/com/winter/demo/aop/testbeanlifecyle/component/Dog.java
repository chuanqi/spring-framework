package com.winter.demo.aop.testbeanlifecyle.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:51
 */
@Component
@PropertySource("classpath:dog.properties")
public class Dog {
	@Value("旺财")
	private String name;
	@Value("#{${dog.age}-1}")
	private int age;
	@Value("${dog.color}")
	private String color;


	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", age=" + age +
				", color='" + color + '\'' +
				'}';
	}
}
