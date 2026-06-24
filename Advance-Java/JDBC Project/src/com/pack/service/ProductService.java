package com.pack.service;

import java.util.List;

import com.pack.model.Product;

public interface ProductService {
	boolean addNewProduct();
	List<Product> getAll();

}
