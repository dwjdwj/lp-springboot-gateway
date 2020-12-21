package com.cn.lp.controller;
import com.cn.lp.entity.Swfitentity;
import com.cn.lp.service.SwfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/swfit")
public class SwfitController {
    @Autowired
    SwfitService swfitservice;
        @RequestMapping(value = "/user", method = RequestMethod.GET)
        public Swfitentity findUserByName(@RequestParam(value = "userName", required = true) String userName) {

            return swfitservice.findUserByName(userName);
        }

    }


