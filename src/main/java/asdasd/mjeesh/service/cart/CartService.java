package asdasd.mjeesh.service.cart;

import asdasd.mjeesh.model.items.BuyItem;
import asdasd.mjeesh.model.items.CartItems;

import java.util.Optional;

public interface CartService {

    CartItems save(CartItems cart);

    Optional<CartItems> findById(Long accountId);

    void addItem(Long accountId, BuyItem item);
}
