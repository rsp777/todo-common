package com.pawar.inventory.entity;

public class Category {


	private Integer categoryId;

	private String categoryName;

	public Category() {

	}

	public Category(Integer categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Integer getCategory_id() {
		return categoryId;
	}

	public void setCategory_id(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategory_name() {
		return categoryName;
	}

	public void setCategory_name(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

}
