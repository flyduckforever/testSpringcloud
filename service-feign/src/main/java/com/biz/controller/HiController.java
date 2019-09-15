package com.biz.controller;/**
 * @author tianshengfei
 * @Date 2019/9/14 13:38
 * @description
 */

import com.biz.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: testSpringcloud
 * @description: 测试
 * @author: tianshengfei
 * @create: 2019-09-14 13:38
 **/
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("hi")
    public String sayHi(){
        return schedualServiceHi.sayHi();
    }
}
