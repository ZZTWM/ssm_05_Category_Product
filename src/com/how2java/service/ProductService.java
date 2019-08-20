package com.how2java.service;

import java.util.List;
import java.util.Map;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;

public interface ProductService {

	List<Product> list(Map m);
	int total(Category c);

	void add(Product c);
	void update(Product c);
	void delete(Product c);
	Product get(int id);

}
