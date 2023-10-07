package com.majidmostafavi.service;

import com.majidmostafavi.dao.ProductDao;
import com.majidmostafavi.entity.Product;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import java.util.List;

@RequestScoped
public class ProductService {

    @Inject
    ProductDao productDao;
    public List<Product>findAllProduct(){
        return  productDao.findAllProduct();
    }
}
