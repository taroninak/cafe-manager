package tk.taroninak.cafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tk.taroninak.cafe.models.Product;
import tk.taroninak.cafe.services.ProductService;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
}

