package asdasd.mjeesh.model.items;

import asdasd.mjeesh.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cart_items")
public class CartItems extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "buy_item_id")
    private BuyItem item;

    public void setAccount(Account account) {
        this.account = account;
        this.account.getItems().add(this);
    }

    public void setItem(BuyItem item) {
        this.item = item;
        item.getItems().add(this);
    }
}
