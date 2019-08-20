package com.winter.demo.aop.testBeanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:06
 */
public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		System.out.println("===初始化完成");
		System.out.println("===构建第一个对象");
		//MainConfig 不加@Lazy时,在此之前就会打印  构造person对象
		Person person1 = (Person) ctx.getBean("person"); //MainConfig 加@Lazy时,在这里是第一次使用 会打印  构造person对象
		System.out.println("===构建第二个对象");
		Person person2 = (Person) ctx.getBean("person");
		System.out.println("===比较两个对象");
		System.out.println(person1 == person2);
	}
}
