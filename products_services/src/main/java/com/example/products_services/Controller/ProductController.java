package com.example.products_services.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Products")
public class ProductController {

    @PostMapping
    public String createProduct(){
        return "Http Post Handled";
    }

    @GetMapping
    public String getProduct(){
        return "Http Get Handled";
    }

    @PutMapping
    public String EditProduct(){
        return "Http Put Handled";
    }

    @DeleteMapping

    public String DeleteProduct(){
        return "Http Delete Handled";
    }

}
