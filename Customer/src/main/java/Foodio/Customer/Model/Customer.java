package Foodio.Customer.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long customerId;
    public String name;
    @Column(unique = true)
    public String email;
    @Column(unique = true)
    public String phone;
    @Column(unique = true)
    public long userId;

}
