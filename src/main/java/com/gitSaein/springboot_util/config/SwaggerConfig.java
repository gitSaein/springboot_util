package com.gitSaein.springboot_util.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/*
 * @author: SAEIN
 * swagger configuration
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.gitSaein.springboot_util.controller")) //or RequestHandlerSelectors.any() : Any url extracted from RequestMapping. 
				.paths(PathSelectors.ant("/api/**")) //path of starting 'api-*'
				.build()
				.useDefaultResponseMessages(false)
				.globalResponseMessage(RequestMethod.GET, 
						Arrays.asList(
								new ResponseMessageBuilder()
									.code(500)
									.message("Internal Server Error")
									.responseModel(new ModelRef("Error"))
									.build(),
								new ResponseMessageBuilder()
									.code(400)
									.message("Bad Request")
									.build(),
								new ResponseMessageBuilder()
									.code(404)
									.message("Not Found")
									.build()));
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("API Document")
				.description("API List")
				.version("1.0.0")
				.build();
	}
}
