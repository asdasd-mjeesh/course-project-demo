package asdasd.mjeesh.repository;

import asdasd.mjeesh.model.items.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order save(Order order);

    @Override
    Optional<Order> findById(Long aLong);

}
