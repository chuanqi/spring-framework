package com.winter.demo.aop;


/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 22:18
 */
public class Car {
	private Integer wheel;

	public Integer getWheel() {
		return wheel;
	}

	public void setWheel(Integer wheel) {
		this.wheel = wheel;
	}

	public void run() {
		System.out.println(wheel + " 车开起来了");
	}
}
