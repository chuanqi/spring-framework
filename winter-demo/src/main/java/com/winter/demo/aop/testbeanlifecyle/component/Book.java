package com.winter.demo.aop.testbeanlifecyle.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 10:16
 */
@Component
public class Book {
	public Book() {
		System.out.println(" +++Book constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println(" +++Book init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println(" ---Book destroy");
	}
}
