package com.cn.lp.qrcard.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class LpGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpGatewayApplication.class, args);
	}

}
