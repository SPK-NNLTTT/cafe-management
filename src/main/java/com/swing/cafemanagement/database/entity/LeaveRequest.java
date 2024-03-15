package com.swing.cafemanagement.database.entity;

import com.swing.cafemanagement.database.enumrate.RequestStatus;
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
        name = "leave_requests"
)
@ToString(callSuper = true)
public class LeaveRequest extends BaseModel {

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_leave_requests_user"))
    private User user;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "replacement_user_id", foreignKey = @ForeignKey(name = "fk_leave_requests_replacement_user"))
    private User replacementUser;

    private String reason;

    private RequestStatus requestStatus;

    @Column(name = "start_date")
    private Long startDate;

    @Column(name = "end_date")
    private Long endDate;
}
