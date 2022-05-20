package asdasd.mjeesh.rest;

import asdasd.mjeesh.mapper.OrderFactory;
import asdasd.mjeesh.model.dto.OrderDto;
import asdasd.mjeesh.model.items.Order;
import asdasd.mjeesh.model.items.OrderItem;
import asdasd.mjeesh.repository.BuyItemRepository;
import asdasd.mjeesh.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/carts")
public class OrderControllerV1 {
    private final OrderService orderService;
    private final OrderFactory orderFactory;

    @Autowired
    public OrderControllerV1(OrderService cartService, OrderFactory orderFactory) {
        this.orderService = cartService;
        this.orderFactory = orderFactory;
    }

    @GetMapping("/{id}")
    public OrderDto getById(@PathVariable("id") Long id) {
        Order order = orderService.findById(id).orElse(new Order());
        return orderFactory.map(order);
    }

    @PostMapping("/{id}")
    public void addItem(@PathVariable("id") Long accountId,
                        @RequestBody OrderItem item) {
        orderService.addItem(accountId, item);
    }


}
