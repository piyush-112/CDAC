package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.entities.Product;

public interface ProductService {
	ApiResponse addProduct(Product product);

	List<Product> getAllProducts();

	ApiResponse purchase(Long productId, int qty);

	ApiResponse deleteProductDetails(Long id);

}
