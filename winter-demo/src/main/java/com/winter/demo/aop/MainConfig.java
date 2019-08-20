package com.winter.demo.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 22:32
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MainConfig {
	@Bean
	public Car car() {
		return new Car();
	}
}
