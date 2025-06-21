package org.example.ecommercespring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @GetMapping // If we call a GET request on /api/categories
    public String getCategory() {
        return "Electronics";
    }

    @PostMapping
    public String getPostCategory() {
        return "Post Electronics";
    }

    @GetMapping("/count")  // If we call a GET request on /api/categories/count
    public int getCategoryCount() {
        return 5;
    }
}