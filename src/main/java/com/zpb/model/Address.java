package com.zpb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/8/5 14:37
 * @updateDate   2021/8/5 14:37
 * @version      1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;

    /**
     * 街道
     */
    private String street;

}
