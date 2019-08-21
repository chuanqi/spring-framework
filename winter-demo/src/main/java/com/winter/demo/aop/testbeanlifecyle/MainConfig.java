package com.winter.demo.aop.testbeanlifecyle;

import com.winter.demo.aop.testbeanlifecyle.component.Car;
import com.winter.demo.aop.testbeanlifecyle.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: import ImportBeanDefinitionRegistrar 可应用于自定义 类加载  第三方类加载等
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:49
 */
@Configuration
//定义ComponentScan扫描会自动扫描当前包下的所有@Component @Controller @Service @Repository的类,装入IOC容器
@ComponentScan
public class MainConfig {

	@Bean(initMethod = "init", destroyMethod = "destory")
	//prototype多实例情况下,bean不会自动创建,而是在第一次使用的时候被创建,bean的销毁也不受ioc容器管理,而是由gc处理
	//@Scope(scopeName = "prototype")
	public Car car() {
		return new Car();
	}

	@Bean
	public Person person() {
		return new Person();
	}

}
