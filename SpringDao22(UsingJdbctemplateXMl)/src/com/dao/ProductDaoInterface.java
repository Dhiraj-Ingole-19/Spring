package com.dao;
import com.model.Product;

public interface ProductDaoInterface {
	public int saveProduct(Product p);
	public int updateProduct(Product p);
	public int deleteProduct(Product p);
	public void showProductById(int pid);
	public void showProduct();

}
