package com.click.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


import com.click.pro.vo.CorsConfig;


@SpringBootApplication
@Import(CorsConfig.class)
public class MacroCApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacroCApplication.class, args);
	}

}
