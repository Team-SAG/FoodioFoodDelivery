package Foodio.Customer.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CustomerDTO {
    private String name;
    private String email;
    private String HomeAddress;
    private String phone;
}
