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

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String say2() {
        return "hello2";
    }

    @RequestMapping(value = "/newHello", method = RequestMethod.GET)
    public String newSay() {
        return "你好么？";
    }

    @RequestMapping(value = "/newHello2", method = RequestMethod.GET)
    public String newSay2() {
        return "你好么2？";
    }

    @RequestMapping(value = "/newHello3", method = RequestMethod.GET)
    public String newSay3() {
        return "好的好的";
    }

    @RequestMapping(value = "/newHello4", method = RequestMethod.GET)
    public String newSay4() {
        return "好的好的，啊啊";
    }

    //中途修改
    //pretty girl
}
