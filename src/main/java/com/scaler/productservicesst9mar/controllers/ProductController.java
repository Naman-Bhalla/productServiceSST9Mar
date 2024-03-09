package com.scaler.productservicesst9mar.controllers;

import com.scaler.productservicesst9mar.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// 1. Tell spring this is a special class
//    so automatically create an object of
//    it and inject dependencies if needed
// 2. Tell spring that this class has methods
//    that may need to be called if our server
//    receives a request at particular endpoint
@RestController
public class ProductController {

    // Whenever anyone sends a
    // GET request at {MY_SERVER}/hello
    // run this method and return whatever
    // this is returning to client
    // @PostMapping
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World";
    }


    @GetMapping("/sing")
    public String sayShavaShava() {
        return "Shava Shava";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }


    // URL Path: /products/1
    // /products/hi
    // /products/51
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {

        return new Product();
    }

//    @PostMapping("/products")
//    public Product createProduct(@RequestParam("title") String title,
//                                 @RequestParam("description") String description) {
//        return new Product();
//    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return null;
    }

    // title
    // description
    // categoryName
    // price
    // imageUrl

    // amazon.in/products?title="&desc="uashbijqwioqw   jpoqwj  dwqgvqwxgq  zoxibq  ixxeuwexo"&price=""
    // RequestParams

    // @PathVariable("/categories/{id}/products")
}

// Annotations
// @XYZ
// @
// @Override