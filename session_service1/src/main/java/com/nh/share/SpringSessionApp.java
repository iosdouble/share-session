package com.nh.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @EnableRedisHttpSession开启redis对SpringSession的支持
 *
 */
@SpringBootApplication
@EnableRedisHttpSession
public class SpringSessionApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringSessionApp.class, args);
	}
}

