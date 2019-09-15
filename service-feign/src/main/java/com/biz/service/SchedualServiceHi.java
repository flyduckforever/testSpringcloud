package com.biz.service;/**
 * @author tianshengfei
 * @Date 2019/9/14 13:32
 * @description
 */

import com.biz.service.impl.SchedualServiceHiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: testSpringcloud
 * @description: 测试
 * @author: tianshengfei
 * @create: 2019-09-14 13:32
 **/
@FeignClient(value = "service-hi",fallback = SchedualServiceHiImpl.class)
public interface SchedualServiceHi {

    @RequestMapping("hi")
    String sayHi();
}
