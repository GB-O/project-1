package com.hanwha.model;

import java.sql.Date;

public class OrderInfoDTO {
	private int orderNumber;
	private String cId;
	private int egg;
	private int meat;
	private int bread;
	private int salad;
	private int drink;
	private int method;
	private Date orderdate;
	
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderInfoDTO [orderNumber=").append(orderNumber).append(", cId=").append(cId).append(", egg=")
				.append(egg).append(", meat=").append(meat).append(", bread=").append(bread).append(", salad=")
				.append(salad).append(", drink=").append(drink).append(", method=").append(method)
				.append(", orderdate=").append(orderdate).append("]");
		return builder.toString();
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public int getEgg() {
		return egg;
	}

	public void setEgg(int egg) {
		this.egg = egg;
	}

	public int getMeat() {
		return meat;
	}

	public void setMeat(int meat) {
		this.meat = meat;
	}

	public int getBread() {
		return bread;
	}

	public void setBread(int bread) {
		this.bread = bread;
	}

	public int getSalad() {
		return salad;
	}

	public void setSalad(int salad) {
		this.salad = salad;
	}

	public int getDrink() {
		return drink;
	}

	public void setDrink(int drink) {
		this.drink = drink;
	}

	public int getMethod() {
		return method;
	}

	public void setMethod(int method) {
		this.method = method;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public OrderInfoDTO() {
		super();
	}

	public OrderInfoDTO(int orderNumber, String cId, int egg, int meat, int bread, int salad, int drink, int method,
			Date orderdate) {
		super();
		this.orderNumber = orderNumber;
		this.cId = cId;
		this.egg = egg;
		this.meat = meat;
		this.bread = bread;
		this.salad = salad;
		this.drink = drink;
		this.method = method;
		this.orderdate = orderdate;
	}
	
	
	
}
