package com.example.cloudProduct;

public class ProductDto 
{
	String name;
	String price;
	Boolean availability;
	public ProductDto()
	{
		
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPrice() 
	{
		return price;
	}
	public void setPrice(String price) 
	{
		this.price = price;
	}
	public Boolean getAvailability()
	{
		return availability;
	}
	public void setAvailability(Boolean availability)
	{
		this.availability = availability;
	}
	

}
