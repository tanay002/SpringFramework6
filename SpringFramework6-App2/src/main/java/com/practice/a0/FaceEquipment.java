package com.practice.a0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("faceCategories") 
public class FaceEquipment implements Category{

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

	public FaceEquipment(long id, String productName, long price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "FaceEquipment [id=" + id + ", productName=" + productName + ", price=" + price 
				+ "]";
	}

	@Override
	public void fetchDetails() {

		System.out.println("Get Data for cosmetics" );

	}
	@Override
	public void setCategoryDetails() {
		System.out.println("Set Data for cosmetics");

	}
	public FaceEquipment() {
		super();
	}

}
