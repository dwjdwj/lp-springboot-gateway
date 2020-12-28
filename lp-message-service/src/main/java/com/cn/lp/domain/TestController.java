package com.cn.lp.domain;

import com.cn.lp.domain.fegin.Swfitentity;
import com.cn.lp.fegin.SwiftFeignClient;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
@ApiOperation(value = "测试接口")
@RestController
public class TestController {
    @Autowired
    ApplicationContext applicationContext;


    @Autowired
    SwiftFeignClient swiftFeignClient;

    @RequestMapping(value ="/message/queryUser", method = RequestMethod.GET)
    @ApiOperation(value = "测试服务", notes = "测试服务")
        public String test(@RequestParam(value = "userName", required = true) String userName){
         Swfitentity sw = swiftFeignClient.findUserByName(userName);

        return "SwiftFeign接口:"+sw;
    }
    @GetMapping("/message/message")
    @ResponseBody
    public String heath()
    {
        return "message";
    }

}
