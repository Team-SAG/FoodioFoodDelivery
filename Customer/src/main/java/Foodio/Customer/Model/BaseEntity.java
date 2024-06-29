package Foodio.Customer.Model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    private Date createdAt;
    @Column(updatable = false)
    private String createdBy;
    @Column(insertable = false)
    private Date updatedAt;
    @Column(insertable = false)
    private String updatedBy;
}
