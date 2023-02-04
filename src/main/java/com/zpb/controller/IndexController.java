package com.zpb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

/**
 * @author       pengbo.zhao
 * @description  测试
 * @createDate   2021/7/31 12:14
 * @updateDate   2021/7/31 12:14
 * @version      1.0
 */
@RestController
@RequestMapping
public class IndexController {

    @PostMapping("index1")
    public LocalDateTime index1(){
        return LocalDateTime.now();
    }


}
