package com.example.cloudProduct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
	@Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getAllProducts() 
    {
        List<Product> productList = productRepository.findAll();
        List<ProductDto> products = new ArrayList<ProductDto>();
        for(Product product : productList )
        {
        	ProductDto productDto = convertToDto(product);
        	products.add(productDto);
        }
        return products;
        
    }

    private ProductDto convertToDto(Product product)
    {
    	ProductDto productDto = new ProductDto();
    	productDto.setName(product.getName());
    	productDto.setPrice(product.getPrice());
    	productDto.setAvailability(product.getAvailability());
    	return  productDto;
		
	}

	public void saveProducts(List<ProductDto> products) 
    {
    	for(ProductDto productDto : products)
    	{
    		productRepository.save(convertToModel(productDto));
    	}
    }
	private Product convertToModel (ProductDto productDto)
	{
		Product product = new Product();
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setAvailability(productDto.getAvailability());
		return product;
		
	}

}
