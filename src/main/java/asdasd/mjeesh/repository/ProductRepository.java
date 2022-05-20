package asdasd.mjeesh.repository;

import asdasd.mjeesh.model.items.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    List<Product> findAll();
}
