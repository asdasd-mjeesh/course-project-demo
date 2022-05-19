package asdasd.mjeesh.repository;

import asdasd.mjeesh.model.items.BuyItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyItemRepository extends JpaRepository<BuyItem, Long> {

    @Override
    BuyItem getById(Long aLong);
}
