package com.tedu.ETCP;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.tedu.ETCP.mapper")
@ComponentScan({"com.tedu.ETCP.service","com.tedu.ETCP.controller"})
@SpringBootApplication
public class EtcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtcpApplication.class, args);
	}

}
