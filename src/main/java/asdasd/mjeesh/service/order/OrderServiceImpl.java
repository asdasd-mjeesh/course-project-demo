package asdasd.mjeesh.service.order;

import asdasd.mjeesh.model.items.Order;
import asdasd.mjeesh.model.items.OrderItem;
import asdasd.mjeesh.repository.AccountRepository;
import asdasd.mjeesh.repository.BuyItemRepository;
import asdasd.mjeesh.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final AccountRepository accountRepository;
    private final BuyItemRepository itemRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, AccountRepository accountRepository, BuyItemRepository itemRepository) {
        this.orderRepository = orderRepository;
        this.accountRepository = accountRepository;
        this.itemRepository = itemRepository;
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Optional<Order> findById(Long accountId) {
        return orderRepository.findById(accountId);
    }

    @Override
    public void addItem(Long accountId, OrderItem item) {
        var account = accountRepository.findById(1L).get();
        item = itemRepository.save(item);

        Order order = findById(accountId).get();//new Order();
        order.setAccount(account);
        order.setItem(item);

        item.setOrder(order);
        save(order);
    }
}
