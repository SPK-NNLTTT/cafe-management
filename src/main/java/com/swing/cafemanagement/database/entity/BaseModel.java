package com.swing.cafemanagement.database.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
@SuperBuilder(toBuilder = true)
@ToString
public class BaseModel {
    @Id
    private String id;

    private Long created;

    private String creator;

    private Long updated;

    private String modifier;

    private Boolean removed;

    @PrePersist
    protected void ensureId() {
        this.setId(UUID.randomUUID().toString());
        this.setCreated(System.currentTimeMillis());
//        this.setCreator(SystemUtil.getCurrentUsername()); // Todo
        this.setRemoved(false);
    }

    @PreUpdate
    protected void setUpdated() {
//        this.setModifier(SystemUtil.getCurrentUsername()); Todo
        this.setUpdated(System.currentTimeMillis());
    }

    public BaseModel(String id) {
        this.id = id;
    }
}
