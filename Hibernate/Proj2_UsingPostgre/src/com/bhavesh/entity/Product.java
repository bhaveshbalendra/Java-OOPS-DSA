package com.bhavesh.entity;

import java.io.Serializable;

//entity class , persistence , domain , model
public class Product implements Serializable {
	//bean properties
	
	private int pid;
	private String pname;
	private float price;
	private float qty;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
	
}
