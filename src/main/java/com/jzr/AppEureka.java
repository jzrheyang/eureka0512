package com.jzr;
//添加注释 jzr222
//添加注释 jzr4444
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEureka {
	public static void main(String[] args) {
		SpringApplication.run(AppEureka.class, args);
	}

}
