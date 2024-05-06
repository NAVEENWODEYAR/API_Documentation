/**
 * 
 */
package com.apidoc.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * @author Naveen K Wodeyar
 * @date 06-05-2024
 * Configuration for Swagger,
 *
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "GOWRI TECH",
								description = "Godess Gowri,",
								summary = "Gowri Ma",
								termsOfService = "Worship",
								version = "1.0",
								contact = @Contact(name = "Ma Gowri",
													email = "gowri@ma.com",
													url = "gowrima.com"),
								license = @License(name = "GOWRI")),
								servers = {@Server(description = "prod",url = "gowritech.in"),
										@Server(description = "test",url = "gowritech.com")},
								security = @SecurityRequirement(name = "jsonWebToken"))
								@SecurityScheme(name = "jsonWebToken",
												in = SecuritySchemeIn.HEADER,
												type = SecuritySchemeType.HTTP,
												bearerFormat = "JWT",
												scheme = "bearer",
												description = "Jwt auth")
public class SwaggerConfig {

}
