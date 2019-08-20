package com.winter.demo.aop.testBeanScope;

import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * a) singleton 单实例的(默认)
 * b) prototype 多实例的
 * c) request 同一次请求
 * d) session 同一个会话级别
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:06
 */
public class MainConfig {
	/**
	 * 修改如下几个注解值 查看 mainClass中输出的不同内容,可以很清晰的看出来,对象创建的时机
	 * @return
	 */
	@Bean
	//@Scope(scopeName = "prototype") // prototype这个模式下,每次获取对象都要重新构建
	//@Lazy //加这个注解,只有当使用时才会构建对象  可以解决 循环依赖问题
	public Person person(){
		return new Person();
	}
}
