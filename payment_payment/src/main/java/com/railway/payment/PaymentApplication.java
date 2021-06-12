package com.railway.payment;

import java.util.Collections;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.railway.payment.dao.PaytmDetailPojo;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PaymentApplication {

	@Bean
	public PaytmDetailPojo getpaymentdetailpojo() {
		return new PaytmDetailPojo();
	}
	
	@Bean
	public  Docket swaggerConfiguration()  {
            return new Docket(DocumentationType.SWAGGER_2)  
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.railway.payment.controller"))
                .paths(PathSelectors.any())                          
                .build()
                .apiInfo(apiDetails());
	}
    private ApiInfo apiDetails() {
	        return  new ApiInfo("Payment Api",
			"Api Collections",
			null,
			null,
			new springfox.documentation.service.Contact(null, null, null),
			null,null,Collections.emptyList());
			
}
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

}
