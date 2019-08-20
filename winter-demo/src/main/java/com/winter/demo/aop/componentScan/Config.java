package com.winter.demo.aop.componentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 22:53
 */
@ComponentScan(basePackages = {"com.winter.demo.aop"},
		excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),
		includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class),
		useDefaultFilters = true)
public class Config {
	/**
	 * 1.useDefaultFilters 默认是true,可以扫到除excludeFilters条件外的
	 * 	这个包basePackages = {"com.winter.demo.aop"}下的所有类
	 * 2.useDefaultFilters =false时 只能扫到 满足 includeFilters中的类
	 *
	 *
	 *
	 */
}
