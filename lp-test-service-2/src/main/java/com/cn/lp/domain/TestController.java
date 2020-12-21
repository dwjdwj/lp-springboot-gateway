package com.cn.lp.domain;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.List;
import org.springframework.web.client.RestTemplate;
@ApiOperation(value = "测试接口")
@RestController
public class TestController {
    @Autowired
    ApplicationContext applicationContext;
    @RequestMapping(value ="test", method = RequestMethod.GET)
    @ApiOperation(value = "测试服务", notes = "测试服务")
    public String test() throws UnknownHostException, java.net.UnknownHostException {
        String IPAddress = InetAddress.getLocalHost().getHostAddress();
        String port = applicationContext.getEnvironment().getProperty("local.server.port");

        return "33333： ".concat(IPAddress).concat(":").concat(port);
    }

}
