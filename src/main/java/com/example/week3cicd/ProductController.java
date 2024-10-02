package com.example.week3cicd;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private List<Product> productList = new ArrayList<>();

    public ProductController(){
        productList.add(new Product("1","TV","Electronics",600.0));
        productList.add(new Product("2","Phone","Electronics",500.0));
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productList;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product newProduct){
        productList.add(newProduct);
        return newProduct;
    }


}
