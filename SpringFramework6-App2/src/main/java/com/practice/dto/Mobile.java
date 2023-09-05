package com.practice.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.practice.Category;

@Component
@Primary
public class Mobile implements Category{

	private Long id;
	private String productName;
	private Long price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Mobile(long id, String productName, long price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", productName=" + productName + ", price=" + price 
				 + "]";
	}
	
	@Override
	public void fetchDetails() {
		System.out.println("Fetching Details For Mobile Data");
	}
	@Override
	public void setCategoryDetails() {
		System.out.println("Setting Details for Mobile Data");
		
	}
	public Mobile() {
		super();
	}

}
