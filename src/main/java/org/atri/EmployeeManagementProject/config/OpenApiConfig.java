package org.atri.EmployeeManagementProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	private String title;
	
	private String description;
	
	private String version;
	
	@Bean
	public OpenAPI customOpenApi() {
		this.title = "APIs of EmployeeManagementProject on Swagger";
		this.description = "powered by Spring Boot Framwork";
		this.version = "1.1.0";
		
		return new OpenAPI()
				.components(new Components())
				.info(new Info()
				.title(this.title)
				.description(this.description)
				.version(this.version)
						);
		
	}
	
}
