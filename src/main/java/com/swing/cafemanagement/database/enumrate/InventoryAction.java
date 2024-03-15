package com.swing.cafemanagement.database.enumrate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum InventoryAction {
    ADD("Thêm sản phẩm vào kho"),

    REMOVED("Lấy sản phẩm ra khỏi kho"),

    UPDATE("Cập nhật số lượng khi nhập sai");

    private final String value;
}
