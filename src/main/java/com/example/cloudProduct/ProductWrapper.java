package com.example.cloudProduct;

import java.util.List;

public class ProductWrapper 
{
	List<ProductDto> products;

	public List<ProductDto> getProducts() 
	{
		return products;
	}

	public void setProducts(List<ProductDto> productList)
	{
		this.products = productList;
	}
	

}
