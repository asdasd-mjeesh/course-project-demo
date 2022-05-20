package asdasd.mjeesh.service.order;

import asdasd.mjeesh.model.items.Order;
import asdasd.mjeesh.model.items.OrderItem;

import java.util.Optional;

public interface OrderService {

    Order save(Order cart);

    Optional<Order> findById(Long accountId);

    void addItem(Long accountId, OrderItem item);
}
