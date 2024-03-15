package com.swing.cafemanagement.database.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "category",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"name"}, name = "uq_categories_name")
        },
        indexes = {
                @Index(columnList = "name", name = "idx_categories_name")
        }
)
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
public class Category extends BaseModel {

    @Column(nullable = false, length = 64)
    private String name;

    private String description;
}
