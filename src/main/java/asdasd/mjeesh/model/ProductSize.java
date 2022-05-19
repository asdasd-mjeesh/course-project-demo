package asdasd.mjeesh.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "size")
public class ProductSize extends BaseEntity {
    @Column(name = "title")
    private String title;
}
