package com.biz;/**
 * @author tianshengfei
 * @Date 2019/9/14 9:55
 * @description
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: testSpringcloud
 * @description: 中心
 * @author: tianshengfei
 * @create: 2019-09-14 09:55
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
