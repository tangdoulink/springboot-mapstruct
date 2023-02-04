package com.zpb.model;

import lombok.Data;

import java.util.Date;


/**
 * @author       pengbo.zhao
 * @description  用户-dto
 * @createDate   2021/7/31 12:19
 * @updateDate   2021/7/31 12:19
 * @version      1.0
 */
@Data
public class UserDTO {

    /**
     * 主键
     */
    private String id;

    /**
     * 名称
     */
    private String name1;

    /**
     * 年龄
     */
    private String age1;

    /**
     * 身高
     */
    private Long height1;

    /**
     * 体重
     */
    private Integer weight1;

    /**
     * 性别
     */
    private SexEnum sex1;

    /**
     * 创建时间
     */
    private Date createTime1;

    /**
     * 更新时间
     */
    private String updateTime1;

    /**
     * 血型
     */
    private Character bloodType1;

    /**
     * 工资卡
     */
    private Double salary1;

    /**
     * 小金库
     */
    private String caseDough1;

    /**
     * 地址
     */
    private Address address;

}
