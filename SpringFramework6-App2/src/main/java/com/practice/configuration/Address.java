package com.practice.configuration;

public class Address {

	private String firstLineAddress;
	private String secondLineAddress;
	
	public String getFirstLineAddress() {
		return firstLineAddress;
	}
	public void setFirstLineAddress(String firstLineAddress) {
		this.firstLineAddress = firstLineAddress;
	}
	public String getSecondLineAddress() {
		return secondLineAddress;
	}
	public void setSecondLineAddress(String secondLineAddress) {
		this.secondLineAddress = secondLineAddress;
	}
	@Override
	public String toString() {
		return "Address [firstLineAddress=" + firstLineAddress + ", secondLineAddress=" + secondLineAddress + "]";
	}
	public Address(String firstLineAddress, String secondLineAddress) {
		super();
		this.firstLineAddress = firstLineAddress;
		this.secondLineAddress = secondLineAddress;
	}
	
	
}
