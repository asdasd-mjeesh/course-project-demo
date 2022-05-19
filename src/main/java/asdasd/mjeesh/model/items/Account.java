package asdasd.mjeesh.model.items;

import asdasd.mjeesh.model.BaseEntity;
import asdasd.mjeesh.model.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account extends BaseEntity {
    @Column(name = "username")
    private String username;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "account")
    private List<CartItems> items = new ArrayList<>();
}
