package asdasd.mjeesh.rest;

import asdasd.mjeesh.model.items.Product;
import asdasd.mjeesh.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductControllerV1 {
    private final ProductService productService;

    @Autowired
    public ProductControllerV1(ProductService productRepository) {
        this.productService = productRepository;
    }

    @GetMapping("")
    public List<Product> getAll() {
        return productService.findAll();
    }
}
