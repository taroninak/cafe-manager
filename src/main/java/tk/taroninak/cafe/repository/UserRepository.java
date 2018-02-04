package tk.taroninak.cafe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tk.taroninak.cafe.models.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
