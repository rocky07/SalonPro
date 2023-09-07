package com.billing.BillPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BillProApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillProApplication.class, args);
	}

}
