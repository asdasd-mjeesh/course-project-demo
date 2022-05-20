package asdasd.mjeesh.mapper;

import asdasd.mjeesh.model.dto.OrderDto;
import asdasd.mjeesh.model.dto.OrderItemDto;
import asdasd.mjeesh.model.items.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class OrderFactory implements MapperFactory<OrderDto, Order> {
    private final ProductFactory productFactory;

    @Autowired
    public OrderFactory(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    @Override
    public OrderDto map(Order order) {
        return new OrderDto(
                order.getId(),
                order.getItems().stream()
                        .map(
                        product -> new OrderItemDto(
                                product.getId(),
                                productFactory.map(product.getProduct()),
                                product.getSize(),
                                product.getCount()
                                ))
                        .collect(Collectors.toList())
        );
    }
}
