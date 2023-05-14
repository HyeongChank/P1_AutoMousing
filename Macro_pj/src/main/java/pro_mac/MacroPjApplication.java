package pro_mac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

import pro_mac_service.CorsConfig;

@SpringBootApplication
@Import(CorsConfig.class)
public class MacroPjApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacroPjApplication.class, args);
	}

}
