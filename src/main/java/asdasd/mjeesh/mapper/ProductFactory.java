package asdasd.mjeesh.mapper;

import asdasd.mjeesh.model.dto.ProductDto;
import asdasd.mjeesh.model.items.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductFactory implements MapperFactory<ProductDto, Product> {

    @Override
    public ProductDto map(Product product) {
        return new ProductDto(
                product.getId(),
                product.getTitle(),
                product.getType(),
                product.getSizes()
        );
    }
}
