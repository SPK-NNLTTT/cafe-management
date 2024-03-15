package com.swing.cafemanagement.database.enumrate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductUnit {

    PIECE("Cái"),

    BOTTLE("Bình"),

    JAR("Chai"),

    BAG("Bịch"),

    GLASS("Ly");

    private final String value;
}
