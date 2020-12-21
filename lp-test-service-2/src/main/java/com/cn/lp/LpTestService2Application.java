package com.cn.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableCaching  //开启缓存
@EnableScheduling
public class LpTestService2Application {
   /* @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }*/
    public static void main(String[] args) {
        SpringApplication.run(LpTestService2Application.class, args);
    }

}
