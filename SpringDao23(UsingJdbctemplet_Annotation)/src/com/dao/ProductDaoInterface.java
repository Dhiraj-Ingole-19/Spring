package com.dao;
import org.springframework.stereotype.Repository;

import com.model.Product;
@Repository
public interface ProductDaoInterface {
	public int saveProduct(Product p);
	public int updateProduct(Product p);
	public int deleteProduct(Product p);
	public void showProductById(int pid);
	public void showProduct();

}
