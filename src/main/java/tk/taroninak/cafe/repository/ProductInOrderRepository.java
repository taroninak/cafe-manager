package tk.taroninak.cafe.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tk.taroninak.cafe.models.User;

public interface ProductInOrderRepository extends PagingAndSortingRepository<User, Long> {
}
