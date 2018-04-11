package com.matcheng.patch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping
    public String ping(){

        String ping = "补丁程序 - jdk1.6 + mysql 版本";
        logger.info(ping);
        return ping;

    }


}
