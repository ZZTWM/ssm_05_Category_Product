package com.how2java.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{
	@Autowired
	ProductMapper productMapper;
	
	



	@Override
	public void add(Product c) {
		productMapper.add(c);
		
	}


	@Override
	public void update(Product c) {
		productMapper.update(c);
	}


	@Override
	public void delete(Product c) {
		productMapper.delete(c.getId());
	}


	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return productMapper.get(id);
	}


	@Override
	public List<Product> list(Map m) {
		// TODO Auto-generated method stub
		return productMapper.list(m);
	}


	@Override
	public int total(Category c) {
		// TODO Auto-generated method stub
		return productMapper.total(c);
	}


}
