package com.winter.demo.aop.testbeanlifecyle;

import com.winter.demo.aop.testbeanlifecyle.component.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 22:29
 */
public class MainClass {
	public static void main(String[] args) {
		System.out.println("test bean life cyle");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] beans = ctx.getBeanDefinitionNames();

		for (String bean : beans) {
			System.out.println(bean);
		}
		Dog dog = ctx.getBean(Dog.class);
		System.out.println(dog.toString());
		//这里会触发单实例的bean销毁方法
		ctx.close();
	}
}
