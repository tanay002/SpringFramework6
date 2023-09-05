package com.practice.dto;

import com.practice.Category;

public class FaceEquipment implements Category{

	private Long id;
	private String productName;
	private Long price;
	private Brand brand;
	private CategoryDetails categoryDetails;

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
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public FaceEquipment(long id, String productName, long price, Brand brand) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.brand = brand;
		setCategoryDetails();
	}

	@Override
	public String toString() {
		return "FaceEquipment [id=" + id + ", productName=" + productName + ", price=" + price + ", brand=" + brand
				+ ", categoryDetails=" + categoryDetails + "]";
	}
	@Override
	public void setCategoryDetails() {
		CategoryDetails categoryDetails=new CategoryDetails(1L,"Cosmetics");
		this.categoryDetails=categoryDetails;
	}
	
	@Override
	public void fetchDetails() {
		
		System.out.println("Cosmetics"+productName+" "+price+" "+brand.getBrandName()+" "+categoryDetails.getCategoryName());

	}

}
