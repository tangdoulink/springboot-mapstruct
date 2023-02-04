package com.zpb.model;

import lombok.*;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/8/5 14:36
 * @updateDate   2021/8/5 14:36
 * @version      1.0
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum SexEnum {

    /**
     * 性别
     */
    WOMAN(0, "女"),
    MAN(1, "男");

    private Integer code;
    private String desc;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
