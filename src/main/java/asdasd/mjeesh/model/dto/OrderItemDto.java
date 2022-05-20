package asdasd.mjeesh.model.dto;

import asdasd.mjeesh.model.ProductSize;

public record OrderItemDto(Long id,
                           ProductDto product,
                           ProductSize size,
                           Integer count) {
}
