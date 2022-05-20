package asdasd.mjeesh.repository;

import asdasd.mjeesh.model.items.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyItemRepository extends JpaRepository<OrderItem, Long> {

    @Override
    OrderItem getById(Long aLong);
}
