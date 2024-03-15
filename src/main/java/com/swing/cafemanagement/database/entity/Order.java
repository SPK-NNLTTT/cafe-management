package com.swing.cafemanagement.database.entity;

import com.swing.cafemanagement.database.enumrate.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
@Table(
        name = "orders"
)
public class Order extends BaseModel {

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "order_status")
    private OrderStatus orderStatus;

    @OneToMany(targetEntity = OrderItem.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", foreignKey = @ForeignKey(name = "fk_order_items_order"))
    List<OrderItem> orderItems;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_order_user"))
    private User user;
}
