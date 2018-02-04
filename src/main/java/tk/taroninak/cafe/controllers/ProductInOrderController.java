package tk.taroninak.cafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tk.taroninak.cafe.services.ProductInOrderService;

@Controller
public class ProductInOrderController {
    @Autowired
    private ProductInOrderService productInOrderService;
}
