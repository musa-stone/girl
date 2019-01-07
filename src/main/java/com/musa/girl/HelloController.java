package com.musa.girl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Musa on 2018/8/25.
 */

@RestController
public class HelloController {

    @Resource
    private Girl girl;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return girl.getContent();
    }

    @RequestMapping(value = "/newHello", method = RequestMethod.GET)
    public String newSay() {
        return "你好么？";
    }
}
