package cn.lww.springcloud.reign.controller;

import cn.lww.springcloud.reign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lww
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(String name) {
        System.out.println("feign:"+name);
        return helloService.hello(name);
    }
}
