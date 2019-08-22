package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
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
@PropertySource(value = "classpath:person1.properties", encoding = "utf-8")
public class Person implements BeanNameAware {
	@Autowired
	// @Lazy
	// 不加懒加载 ,dog里调用person无初始值,因为populateBean还未执行
	// 或在BeanFactoryPostProcessor中的postProcessBeanFactory设置
	Dog dog;

	public Person() {
		System.out.println("5.构造 person  对象实例");
		System.out.println("    ===接下来会把 person对象 存入到 singletonFactories 中 ");
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
		System.out.println("9.初始化 person");
	}

	public void destroy() {
		System.out.println("12.ctx.close后 销毁 person");
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
