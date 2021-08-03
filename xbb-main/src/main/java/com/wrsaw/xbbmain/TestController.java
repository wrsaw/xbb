package com.wrsaw.xbbmain;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangRui
 * create at 2021/08/03 下午 4:11
 **/
@RestController
public class TestController {
    @RequestMapping("/test/test")
    public String test() {
        return "test";
    }
}
