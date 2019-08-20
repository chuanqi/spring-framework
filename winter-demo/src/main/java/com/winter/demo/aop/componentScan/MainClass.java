package com.winter.demo.aop.componentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 22:54
 */
public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		String[] beans = ctx.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println(bean);
		}
	}
}
