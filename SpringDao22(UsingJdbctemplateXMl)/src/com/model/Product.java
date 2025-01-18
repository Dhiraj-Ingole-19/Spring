package com.model;

public class Product {
	int pid;
	String pname;
	int quantity;
	double price;
	public Product(int pid, String pname, int quantity, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display()
	  {
		 System.out.println("Product Id:"+pid);
		 System.out.println("Product Name:"+pname);
		 System.out.println("Product Qty:"+quantity);
		 System.out.println("Product Price:"+price);
	  }
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
