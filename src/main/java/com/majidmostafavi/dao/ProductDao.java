package com.majidmostafavi.dao;

import com.majidmostafavi.entity.Product;
import jakarta.enterprise.context.RequestScoped;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RequestScoped
public class ProductDao {
    private static void sleepExecution(Integer l) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Product> findAllProduct() {
        return IntStream.rangeClosed(1, 10)
                .peek(ProductDao::sleepExecution)
                .peek(i-> System.out.println("Produce count : " + i+ " Thread: "+Thread.currentThread().getName() + " " + Thread.currentThread().isVirtual()))
                .mapToObj(
                        i -> new Product(i, "name" + i, "code" + i)
                ).collect(Collectors.toList());
    }

}
