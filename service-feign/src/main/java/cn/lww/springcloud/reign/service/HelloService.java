package cn.lww.springcloud.reign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lww
 * fallback指定熔断类
 */
@FeignClient(value = "hello-service",fallback = HelloServiceHystric.class)
public interface HelloService {
    @RequestMapping(value = "hello")
    String hello(@RequestParam(value = "name") String name);
}
