package tk.taroninak.cafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tk.taroninak.cafe.services.OrderService;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
}
