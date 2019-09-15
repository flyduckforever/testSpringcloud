package com.biz.service;/**
 * @author tianshengfei
 * @Date 2019/9/14 11:12
 * @description
 */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: testSpringcloud
 * @description: 测试
 * @author: tianshengfei
 * @create: 2019-09-14 11:12
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(){
        return restTemplate.getForObject("http://service-hi/hi",String.class);
    }

    public String hiError(){
        return "hi,sorry,error";
    }
}
