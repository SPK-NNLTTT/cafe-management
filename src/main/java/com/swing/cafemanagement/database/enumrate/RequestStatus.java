package com.swing.cafemanagement.database.enumrate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RequestStatus {

    CANCELED("Pending"),

    PAID("Approved"),

    UNPAID("Rejected");

    private final String value;
}
