package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 13:41
 */
@Component
//@Scope(scopeName = "prototype")
@PropertySource(value = "classpath:person1.properties",encoding = "utf-8")
public class Person implements BeanNameAware {
	public Person() {
		System.out.println("构造 person  对象实例");
	}

	@Value("${person.age}")
	private int age;
	@Value("${person.name}")
	private String name;
	@Value("${person.sex}")
	private String sex;
	private String province;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void init() {
		System.out.println("初始化 person");
	}

	public void destroy() {
		System.out.println("销毁 person");
	}

	@Override
	public String toString() {
		return "Person{" +
				"age=" + age +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", province='" + province + '\'' +
				'}';
	}

	@Override
	public void setBeanName(String name) {

	}
}
