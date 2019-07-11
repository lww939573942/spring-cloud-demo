package cn.lww.springcloud.reign.service;

import org.springframework.stereotype.Component;

/**
 * @author lww
 */
@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String hello(String name) {
        return "sorry,error!";
    }
}
