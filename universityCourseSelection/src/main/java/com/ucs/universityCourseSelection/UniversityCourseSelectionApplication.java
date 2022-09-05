package com.ucs.universityCourseSelection;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ucs.universityCourseSelection.repository.AdmissionRepository;
import com.ucs.universityCourseSelection.repository.ApplicantRepository;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ucs.universityCourseSelection"})
@EnableSwagger2
public class UniversityCourseSelectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityCourseSelectionApplication.class, args);
	}
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
	         .apis(RequestHandlerSelectors.basePackage("com.ucs.universityCourseSelection.controller")).build().apiInfo(apiInfo());
	   }
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() 
	{
		return new ApiInfoBuilder().title("University Courses Selection").description("this App usful for students as well as professors").termsOfServiceUrl("http://godknows.com").contact("tulsi@gmail.com").license("My License").licenseUrl("tulsi@gmail.com").version("1.0").build();
		}
	
}
