package com.winter.demo.aop.testImport;

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
		String[] beans = ctx.getBeanDefinitionNames();
		System.out.println("Import 装配");
		for (String bean : beans) {
			System.out.println(bean);
		}
		//获取car对象
		Object bean1 = ctx.getBean("carFactoryBean");
		System.out.println(bean1);
		//前缀加&符号获取对象本身
		Object bean2 = ctx.getBean("&carFactoryBean");
		System.out.println(bean2);
	}
}
