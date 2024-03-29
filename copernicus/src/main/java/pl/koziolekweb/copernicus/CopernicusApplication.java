package pl.koziolekweb.copernicus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class CopernicusApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CopernicusApplication.class, args);
	}
}
