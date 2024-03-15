package com.swing.cafemanagement.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "inventory"
)
@ToString(callSuper = true)
public class Inventory extends BaseModel {

    @OneToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_inventory_product"))
    private Product product;

    private Integer quantity;
}
