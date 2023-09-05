package com.practice.configuration;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public Student(int id, String name, int age,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address=address;
	}
	
	
}
