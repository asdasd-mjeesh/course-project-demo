package asdasd.mjeesh.model.dto;

import java.util.List;

public record OrderDto(Long id,
                       List<OrderItemDto> items) {
}
