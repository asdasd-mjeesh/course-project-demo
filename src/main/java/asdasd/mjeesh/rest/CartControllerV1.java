package asdasd.mjeesh.rest;

import asdasd.mjeesh.model.items.BuyItem;
import asdasd.mjeesh.model.items.CartItems;
import asdasd.mjeesh.repository.BuyItemRepository;
import asdasd.mjeesh.service.cart.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/carts")
public class CartControllerV1 {
    private final CartService cartService;
    private final BuyItemRepository buyItemRepository;

    @Autowired
    public CartControllerV1(CartService cartService, BuyItemRepository buyItemRepository) {
        this.cartService = cartService;
        this.buyItemRepository = buyItemRepository;
    }

    @GetMapping("/{id}")
    public CartItems getById(@PathVariable("id") Long id) {
        return cartService.findById(id).orElse(new CartItems());
    }

    @PostMapping("/{id}")
    public void addItem(@PathVariable("id") Long accountId,
                        @RequestBody BuyItem item) {
        cartService.addItem(accountId, item);
    }

    @GetMapping("/asd")
    BuyItem getBuyItem() {
        return buyItemRepository.getById(1L);
    }

    @PostMapping("/cart")
    BuyItem saveBuyItem(@RequestBody BuyItem item) {
        return buyItemRepository.save(item);
    }
}
