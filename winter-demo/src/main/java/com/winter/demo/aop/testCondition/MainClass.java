package com.winter.demo.aop.testCondition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:35
 */
public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		String[] beans = ctx.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println(bean);
		}
	}
}
