package com.cn.lp.controller;
import com.cn.lp.entity.Swfitentity;
import com.cn.lp.service.SwfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/swfit")
public class SwfitController {
    @Autowired
    SwfitService swfitservice;
        @RequestMapping(value = "/user", method = RequestMethod.GET)
        public Swfitentity findUserByName(@RequestParam(value = "userName", required = true) String userName) {
            return swfitservice.findUserByName(userName);
        }

    }


