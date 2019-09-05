package com.hanwha.model;

public class FoodDetailDTO {
	private int foodSequence;
	private String itemName;
	private String menuName;
	private int price;
	
	public int getFoodSequence() {
		return foodSequence;
	}
	public void setFoodSequence(int foodSequence) {
		this.foodSequence = foodSequence;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public FoodDetailDTO(int foodSequence, String itemName, String menuName, int price) {
		super();
		this.foodSequence = foodSequence;
		this.itemName = itemName;
		this.menuName = menuName;
		this.price = price;
	}
	
	public FoodDetailDTO() {}
}
