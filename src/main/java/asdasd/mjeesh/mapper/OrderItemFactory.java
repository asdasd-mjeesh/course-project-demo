package asdasd.mjeesh.mapper;

import asdasd.mjeesh.model.dto.OrderItemDto;
import asdasd.mjeesh.model.items.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderItemFactory implements MapperFactory<OrderItemDto, OrderItem> {
    private final ProductFactory productFactory;

    @Autowired
    public OrderItemFactory(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    @Override
    public OrderItemDto map(OrderItem orderItem) {
        return new OrderItemDto(
                orderItem.getId(),
                productFactory.map(orderItem.getProduct()),
                orderItem.getSize(),
                orderItem.getCount()
        );
    }
}
