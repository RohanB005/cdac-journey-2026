package com.pack.dao;

import java.util.List;

import com.pack.model.Product;

public interface ProductDao {
	boolean saveProduct(Product p);
	List<Product> findAll();

}
