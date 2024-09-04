package com.example.cloudProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	 @Autowired
	    private ProductService productService;

	    @PostMapping("/store-products")
	    public ResponseEntity<?> storeProducts(@RequestBody ProductWrapper products) 
	    {
	        productService.saveProducts(products.getProducts());
	        return ResponseEntity.ok("{\"message\": \"Success.\"}");
	    }

	    @GetMapping("/list-products")
	    public ResponseEntity<ProductWrapper> listProducts() 
	    {
	        List<ProductDto> products = productService.getAllProducts();
	        ProductWrapper productWrapper = new ProductWrapper();
	        productWrapper.setProducts(products);
	        return ResponseEntity.ok(productWrapper);
	    }

}
