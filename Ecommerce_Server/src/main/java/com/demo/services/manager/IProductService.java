package com.demo.services.manager;

import com.demo.entities.Products;
import com.demo.models.ProductInfo;

public interface IProductService {

	public Iterable<ProductInfo> findAllInfo();
	
	public ProductInfo findInfoById(int id);
	
	public Products findById(int id);
	
	public ProductInfo update(int id, ProductInfo object);
	
	public void delete(int id);
	
	public int toggleStatus(int id);
	
	public int updateBanReason(int id, String banReason);
}