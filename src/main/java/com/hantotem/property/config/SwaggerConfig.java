package com.hantotem.property.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * @author geekerstar
 * @date 2020/8/25 13:59
 * @description
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket allApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("1000.所有接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hantotem.property.controller"))
                .paths(PathSelectors.any())
                .build()
                .securityContexts(Lists.newArrayList(securityContext()))
                .apiInfo(apiInfo());
    }

    @Bean
    public Docket stockApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("1001.出入库")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hantotem.property.controller.stock"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    @Bean
    public Docket searchApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("1002.搜索")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hantotem.property.controller.search"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiKey token() {
        return new ApiKey("token", "authorization", "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("/.*"))
                .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference("BearerToken", authorizationScopes));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("涉案财物中心服务")
                .description("涉案财物中心服务")
                .version("1.0")
                .termsOfServiceUrl("")
                .contact(new Contact("成都汉图信息技术有限公司", "http://www.hantotem.com", ""))
                .license("")
                .licenseUrl("")
                .build();
    }
}
