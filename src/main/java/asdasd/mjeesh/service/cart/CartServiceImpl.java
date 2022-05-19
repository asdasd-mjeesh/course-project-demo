package asdasd.mjeesh.service.cart;

import asdasd.mjeesh.model.items.BuyItem;
import asdasd.mjeesh.model.items.CartItems;
import asdasd.mjeesh.repository.AccountRepository;
import asdasd.mjeesh.repository.BuyItemRepository;
import asdasd.mjeesh.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final AccountRepository accountRepository;
    private final BuyItemRepository itemRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, AccountRepository accountRepository, BuyItemRepository itemRepository) {
        this.cartRepository = cartRepository;
        this.accountRepository = accountRepository;
        this.itemRepository = itemRepository;
    }

    @Override
    public CartItems save(CartItems cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Optional<CartItems> findById(Long accountId) {
        return cartRepository.findById(accountId);
    }

    @Override
    public void addItem(Long accountId, BuyItem item) {
        var account = accountRepository.findById(accountId).get();
        var item_before_save = itemRepository.save(item);

//        System.out.println(account);
//        System.out.println(item_before_save);
        CartItems cartItems = new CartItems();
        cartItems.setAccount(account);
        cartItems.setItem(item_before_save);

        save(cartItems);
    }
}
