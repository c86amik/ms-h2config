package com.gokoders.flight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@OpenAPIDefinition(info =
	@Info(title = "Flight Search Service API", version = "1.0", description = "Documentation Flight Search Service API v1.0")
)
public class FlightSearchServiceApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FlightSearchServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FlightSearchServiceApplication.class, args);
		LOGGER.info("FlightSearchDetails Microservice Started");
	}

}
