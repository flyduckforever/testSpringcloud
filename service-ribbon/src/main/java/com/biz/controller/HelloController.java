package com.biz.controller;/**
 * @author tianshengfei
 * @Date 2019/9/14 11:17
 * @description
 */

import com.biz.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: testSpringcloud
 * @description: 测试
 * @author: tianshengfei
 * @create: 2019-09-14 11:17
 **/
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("hi")
    public String hi(){
        return helloService.hiService();
    }
}
