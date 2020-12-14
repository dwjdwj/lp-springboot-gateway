package com.cn.lp.controller;
import com.cn.lp.entity.Swfitentity;
import com.cn.lp.service.SwfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/swfit")
public class SwfitController {
    @Autowired
    SwfitService service;
    @RequestMapping("/swfitList")
    public List getSwfitList(){
        return service.findAllSwfit();
    }
    @RequestMapping("/add")
    public String addSwfit(@RequestBody Swfitentity swfit){
        if (swfit!=null) {
            service.createSwfit(swfit);
            return "success";
        }else{
            return "error";
        }
    }
    @RequestMapping("/delswfit")
    public String delSwfit(@RequestParam String id){
        try {
            service.delSwfit(id);
            return "del success";
        } catch (Exception e) {
            e.printStackTrace();
            return "del false";
        }
    }
    @RequestMapping("/updateswfit")
    public String updateSwfit(@RequestBody Swfitentity swfit){
        try {
            service.updateSwfit(swfit);
            return "update success";

        } catch (Exception e) {
            e.printStackTrace();
            return "update false";
        }

    }
    //测试方法，返回服务器端接口，以判断是哪个服务
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "zhangsan")String name){
        return "hi"+name+",i am from port:"+port;
    }
}

