package com.jason.mall.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 API Configuration
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // generate SwaggerUI for current controller
                .apis(RequestHandlerSelectors.basePackage("com.jason.mall.controller"))
                // generate SwaggerUI for @API annotated controller
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                // generate SwaggerUI for @ApiOperation annotated controller
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SwaggerUI Display")
                .description("Welcome to Jason Guo's tiny mall!")
                .version("1.0")
                .build();
    }
}