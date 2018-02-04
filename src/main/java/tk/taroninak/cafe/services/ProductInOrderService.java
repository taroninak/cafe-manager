package tk.taroninak.cafe.services;

import org.springframework.beans.factory.annotation.Autowired;
import tk.taroninak.cafe.repository.ProductInOrderRepository;

public class ProductInOrderService {
    @Autowired
    private ProductInOrderRepository productInOrderRepository;
}
