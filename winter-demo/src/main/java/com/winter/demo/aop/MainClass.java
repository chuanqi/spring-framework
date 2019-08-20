package com.winter.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 22:29
 */
public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Car car = (Car) ctx.getBean("car");
		car.setWheel(4);
		car.run();
	}
}
