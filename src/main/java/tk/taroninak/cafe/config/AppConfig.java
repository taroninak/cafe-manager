package tk.taroninak.cafe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.taroninak.cafe.services.*;

@Configuration
public class AppConfig {
    @Bean
    UserService userService() {
        return new UserService();
    }

    @Bean
    OrderService orderService() {
        return new OrderService();
    }

    @Bean
    TableService tableService() {
        return new TableService();
    }

    @Bean
    ProductService productService() {
        return new ProductService();
    }

    @Bean
    ProductInOrderService productInOrderService() {
        return new ProductInOrderService();
    }
}
