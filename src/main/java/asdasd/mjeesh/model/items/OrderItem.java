package asdasd.mjeesh.model.items;

import asdasd.mjeesh.model.BaseEntity;
import asdasd.mjeesh.model.ProductSize;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "orders_product")
public class OrderItem extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "size_id")
    private ProductSize size;

    @Column(name = "count")
    private Integer count;

    public void setOrder(Order order) {
        this.order = order;
        this.order.getItems().add(this);
    }

    @JsonBackReference
    public Order getOrder() {
        return order;
    }
}
