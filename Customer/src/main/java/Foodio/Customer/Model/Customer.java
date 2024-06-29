package Foodio.Customer.Model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long CustomerId;
    private String name;
    @Column(unique = true)
    private String email;
    private String HomeAddress;
    @Column(unique = true)
    private String phone;
    private long userId;

}
