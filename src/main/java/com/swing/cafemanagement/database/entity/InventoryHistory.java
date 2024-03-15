package com.swing.cafemanagement.database.entity;

import com.swing.cafemanagement.database.enumrate.InventoryAction;
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
        name = "inventory_history"
)
@ToString(callSuper = true)
public class InventoryHistory extends BaseModel {

    @ManyToOne(targetEntity = Inventory.class)
    @JoinColumn(name = "inventory_id", foreignKey = @ForeignKey(name = "fk_inventory_history_inventory"))
    private Inventory inventory;

    private InventoryAction inventoryAction;

    private Integer oldQuantity;

    private Integer newQuantity;
}
