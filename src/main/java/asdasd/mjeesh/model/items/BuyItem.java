package asdasd.mjeesh.model.items;

import asdasd.mjeesh.model.BaseEntity;
import asdasd.mjeesh.model.Product;
import asdasd.mjeesh.model.ProductSize;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "buy_item")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BuyItem extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "size_id")
    private ProductSize size;

    @Column(name = "count")
    private Integer count;

    @OneToMany(mappedBy = "item")
    private List<CartItems> items = new ArrayList<>();
}
