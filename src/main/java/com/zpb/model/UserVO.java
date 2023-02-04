package com.zpb.model;

import lombok.Data;

import java.util.Date;


/**
 * @author       pengbo.zhao
 * @description  用户-PO
 * @createDate   2021/7/31 12:18
 * @updateDate   2021/7/31 12:18
 * @version      1.0
 */
@Data
public class UserVO {

    /**
     * 主键
     */
    private String id;

    /**
     * 名称
     */
    private String name2;

    /**
     * 年龄
     */
    private Integer age2;

    /**
     * 身高
     */
    private Double height2;

    /**
     * 体重
     */
    private String weight2;

    /**
     * 性别
     */
    private String sex2;

    /**
     * 创建时间
     */
    private String createTime2;

    /**
     * 更新时间
     */
    private Date updateTime2;

    /**
     * 血型
     */
    private String bloodType2;

    /**
     * 工资卡
     */
    private String salary2;

    /**
     * 小金库
     */
    private Integer caseDough2;

    /**
     * 地址
     */
    private String province;

}
