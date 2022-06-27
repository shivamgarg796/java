package com.question4;

import java.util.Objects;

public class Product {

	String name;
	double price;
	String company;
	int count;

	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCompany() {
		return company;
	}

	public int getCount() {
		return count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, company);
	}

	@Override
	public boolean equals(Object obj) {

		Product p1 = this;
		Product p2 = (Product) obj;

		if (p1.getName().equals(p2.name) && p1.price == p2.getPrice() && p1.company.equals(p2.getCompany())) {
//			System.out.println(p1.count);
//			System.out.println(p2.count);
//			setCount(p1.getCount()+p2.count);
			return true;
		} else
//			System.out.println("false");
			return false;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]";
	}

}
