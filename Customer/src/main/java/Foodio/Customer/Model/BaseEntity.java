package Foodio.Customer.Model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class BaseEntity {

    @Column(updatable = false)
    public String createdBy;
    @Column(updatable = false)
    public LocalDateTime createdAt;
    @Column(insertable = false)
    public String updatedBy;
    @Column(insertable = false)
    public LocalDateTime updatedAt;

}
