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
        name = "salaries"
)
@ToString(callSuper = true)
public class Salary extends BaseModel {

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_salaries_user"))
    private User user;

    @Column(name = "base_salary")
    private Double baseSalary;

    @Column(name = "leave_deduction")
    private Double leaveDeduction;

    @Column(name = "final_salary")
    private Double finalSalary;

    @Column(name = "salary_month")
    private Long salaryMonth;
}
