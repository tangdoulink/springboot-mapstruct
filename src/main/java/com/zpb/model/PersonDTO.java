package com.zpb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/8/4 13:47
 * @updateDate   2021/8/4 13:47
 * @version      1.0
 */
@Data
@AllArgsConstructor
public class PersonDTO {

    private String name;

    private Integer age;

    private String description;

}
