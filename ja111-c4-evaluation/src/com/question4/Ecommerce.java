package com.question4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList = new ArrayList<>();

	public void addProductToList(Product product) {

		if (productList.contains(product)) {

			for (Product p : productList) {

				if (product.equals(p)) {
					p.setCount(p.getCount() + product.getCount());
				}
			}

			System.out.println("Count updated Product already exists");
		} 
		else {
			productList.add(product);

			System.out.println("Product added successfully");
		}
	}

	public List<Product> showAllProduct() {

		return productList;

	}
}
