
package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.itmayiedu.controller.HelloWoldController;

@ComponentScan(basePackages={"com.itmayiedu.controller"})
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
