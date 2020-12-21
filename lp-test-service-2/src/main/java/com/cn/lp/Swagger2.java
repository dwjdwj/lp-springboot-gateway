package com.cn.lp;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Objects;

/**
 * @author
 * @date 2020/12/16
 */
@Configuration(value = "Swagger2")
@EnableSwagger2
public class Swagger2 {

    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean(name = "restApi")
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            //为当前包路径
            .apis((p) -> Objects.requireNonNull(p).isAnnotatedWith(ApiOperation.class))
            .paths(PathSelectors.any())
            .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            //页面标题
            .title("Spring Boot 测试使用 Swagger2 构建 RESTful API")
            //创建人
            .contact(new Contact("dwj", "----", ""))
            //版本号
            .version("1.0")
            //描述
            .description("API 描述")
            .build();
    }

}