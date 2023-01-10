package com.pks.spring.ex.lifecycle.model;

public class Person {
	
	
	// 이름, 나이
	
	private String name;
	private int age;
	
	
	// 우클릭 -> 소스 -> 제네럴 게터스 엔 세터스
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
