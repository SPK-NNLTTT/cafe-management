package com.swing.cafemanagement.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(
        name = "user"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseModel {
    @Column(nullable = false)
    private String password;

    @Column(length = 200)
    private String email;

    @Column(length = 150)
    private String username;

    @Column(name = "first_name", nullable = false, length = 64)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 64)
    private String lastName;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "base_salary")
    private Double baseSalary;

    @Lob
    @Column(name = "avatar", columnDefinition = "MEDIUMBLOB")
    private byte[] avatar;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false, referencedColumnName = "id"),
            foreignKey = @ForeignKey(name = "fk_users_roles_users"),
            inverseForeignKey = @ForeignKey(name = "fk_users_roles_roles")
    )
    private List<Role> roles;

    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_address_user"))
    private List<Address> addresses;
}
