package com.biz.service.impl;/**
 * @author tianshengfei
 * @Date 2019/9/14 15:19
 * @description
 */

import com.biz.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @program: testSpringcloud
 * @description: 测试
 * @author: tianshengfei
 * @create: 2019-09-14 15:19
 **/
@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Override
    public String sayHi() {
        return "sorry,error";
    }
}
