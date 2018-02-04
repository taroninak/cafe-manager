package tk.taroninak.cafe.services;

import org.springframework.beans.factory.annotation.Autowired;
import tk.taroninak.cafe.repository.ProductRepository;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;
}
