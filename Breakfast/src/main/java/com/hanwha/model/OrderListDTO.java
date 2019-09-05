package com.hanwha.model;

import java.sql.Date;

public class OrderListDTO {

	private String cid;
	private String menuname;
	private int price;
	private Date orderdate;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderListDTO [cid=").append(cid).append(", menuname=").append(menuname).append(", price=")
				.append(price).append(", orderdate=").append(orderdate).append("]");
		return builder.toString();
	}
	
	
	
		
	
}
