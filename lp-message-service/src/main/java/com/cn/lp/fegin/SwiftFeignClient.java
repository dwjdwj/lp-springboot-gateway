package com.cn.lp.fegin;


import com.cn.lp.domain.fegin.Swfitentity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//@RequestMapping("/swfit")
@FeignClient(name = "LP-TEST-SERVICE")
public interface SwiftFeignClient {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Swfitentity findUserByName(@RequestParam(value = "userName", required = true) String userName);
}


