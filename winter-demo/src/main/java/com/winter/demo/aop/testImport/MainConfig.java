package com.winter.demo.aop.testImport;

import com.winter.demo.aop.testImport.component.Car;
import com.winter.demo.aop.testImport.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @Description: import ImportBeanDefinitionRegistrar 可应用于自定义 类加载  第三方类加载等
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:49
 */
@Import({Person.class, Car.class, WinterImportSelector.class, WinterBeanDefinitionRegister.class})
public class MainConfig {

	@Bean
	public CarFactoryBean carFactoryBean() {
		return new CarFactoryBean();
	}
}
