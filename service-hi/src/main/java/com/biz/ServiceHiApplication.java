package com.biz;/**
 * @author tianshengfei
 * @Date 2019/9/14 10:34
 * @description
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: testSpringcloud
 * @description: 启动类
 * @author: tianshengfei
 * @create: 2019-09-14 10:34
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class,args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    public String home(){
        return "port="+port+"welcome service hi";
    }

}
