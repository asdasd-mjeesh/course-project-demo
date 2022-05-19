package asdasd.mjeesh.repository;

import asdasd.mjeesh.model.items.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<CartItems, Long> {

    CartItems save(CartItems cart);

    @Override
    Optional<CartItems> findById(Long aLong);

}
