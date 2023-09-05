package com.practice.dto;

public class CategoryDetails {

	private Long id;
	private String categoryName;
	
	@Override
	public String toString() {
		return "CategoryDetails [id=" + id + ", categoryName=" + categoryName + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public CategoryDetails(Long id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}
	public CategoryDetails() {
		super();
	}
	
	
}
