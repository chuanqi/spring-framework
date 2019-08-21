package com.winter.demo.aop.testbeanlifecyle.component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:53
 */
public class Car {
	public Car() {
		System.out.println("Car构建方法");
	}

	public void init() {
		System.out.println("car 初始化方法");
	}

	public void destory() {
		System.out.println("car 销毁方法");
	}
}
