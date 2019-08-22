package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 13:42
 */
public class MainClass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Person person = ctx.getBean(Person.class);

		System.out.println("输出:" + person.toString());

		ctx.close();
	}
}
