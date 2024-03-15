package com.swing.cafemanagement.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(
        name = "address"
)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
public class Address extends BaseModel{

    @Column(name = "address_line", length = 255)
    private String addressLine;

    @Column(name = "default_address", columnDefinition = "bit default 0 not null")
    private boolean defaultAddress;

//    @Column(name = "province_name", length = 32)
//    private String provinceName;
//
//    @Column(name = "province_name_en", length = 32)
//    private String provinceNameEn;
//
//    @Column(name = "district_name", length = 32)
//    private String districtName;
//
//    @Column(name = "district_name_en", length = 32)
//    private String districtNameEn;
//
//    @Column(name = "ward_name", length = 32)
//    private String wardName;
//
//    @Column(name = "ward_name_en", length = 32)
//    private String wardNameEn;
}
