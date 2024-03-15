package com.swing.cafemanagement.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(callSuper = true)
@Table(
        name = "order_items"
)
public class OrderItem extends BaseModel{
    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_order_item_product"))
    private Product product;

    private Double price;

    private Integer quantity;
}
