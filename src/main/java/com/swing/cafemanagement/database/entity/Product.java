package com.swing.cafemanagement.database.entity;

import com.swing.cafemanagement.database.enumrate.ProductUnit;
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
        name = "product"
)
public class Product extends BaseModel {

    private String name;

    private Double price;

    private ProductUnit productUnit;

    private String description;

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_course_category"))
    private Category category;
}
