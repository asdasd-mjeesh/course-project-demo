package asdasd.mjeesh.model.dto;

import asdasd.mjeesh.model.ProductSize;
import asdasd.mjeesh.model.ProductType;

import java.util.List;

public record ProductDto(Long id,
                         String title,
                         ProductType type,
                         List<ProductSize> sizes) {
}
