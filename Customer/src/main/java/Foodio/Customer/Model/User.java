package Foodio.Customer.Model;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class User {
    private long userId;
    public String username;
    public String password;
    public String role;
}
