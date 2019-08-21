package com.winter.demo.aop.testImport;

import com.winter.demo.aop.testImport.component.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 00:03
 */
public class CarFactoryBean implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		return new Car();
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}


	@Override
	public boolean isSingleton() {
		return true;
	}
}
