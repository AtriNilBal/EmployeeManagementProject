package org.atri.EmployeeManagementProject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Value("${app.swagger.title}")
	private String title;
	
	@Value("${app.swagger.description}")
	private String description;
	
	@Value("${app.swagger.version}")
	private String version;
	
	@Bean
	public OpenAPI customOpenApi() {
		
		return new OpenAPI()
				.components(new Components())
				.info(new Info()
				.title(this.title)
				.description(this.description)
				.version(this.version)
						);
		
	}
	
}
