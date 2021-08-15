package com.example.backend.Service;


import com.example.backend.model.ProductModel;
import com.example.backend.repository.Product_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private Product_repo product_repo;

    public List<ProductModel> getHomeProduct(){
        return (List<ProductModel>) product_repo.findAll();
    }
    public List<ProductModel> getProduct(){
        return (List<ProductModel>) product_repo.findAll();
    }

    public ProductModel productEditData(long id){
        return (ProductModel) product_repo.findById(id).orElse(null);
    }
    public ProductModel productEditSave(ProductModel data){
        ProductModel existingProduct = (ProductModel) product_repo.findById(data.getProductId()).orElse(null);
        existingProduct.setProductName(data.getProductName());
        existingProduct.setDescription(data.getDescription());
        existingProduct.setPrice(data.getPrice());
        existingProduct.setImageUrl(data.getImageUrl());
        existingProduct.setQuantity(data.getQuantity());
        return product_repo.save(existingProduct);
    }

    public ProductModel productSave(ProductModel data){
        return product_repo.save(data);
    }

    public String productDelete(long id){
        product_repo.deleteById(id);
        return "Product Removed !!"+id;
    }

}
