package tk.taroninak.cafe.services;

import org.springframework.beans.factory.annotation.Autowired;
import tk.taroninak.cafe.models.Order;
import tk.taroninak.cafe.repository.OrderRepository;

public class OrderService {
    @Autowired
    private  OrderRepository orderRepository;
}
