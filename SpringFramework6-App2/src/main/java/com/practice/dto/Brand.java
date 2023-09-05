package com.practice.dto;

import com.practice.Category;

public class Brand {
 
	private Long brandId;
	private String brandName;
	
	public Brand(Long brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}
	
}
