package com.it15306;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.it15306.interceptors.AdminInterceptor;
import com.it15306.interceptors.AuthenticateInterceptor;
import com.it15306.interceptors.LogInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	@Autowired
	AuthenticateInterceptor authInterceptor;
	
	@Autowired
	AdminInterceptor adminInterceptor;
	
	@Autowired
	LogInterceptor logInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(logInterceptor)
			.addPathPatterns("/**");

		registry.addInterceptor(authInterceptor)
			.addPathPatterns("/admin/**", "/users/**")
			.excludePathPatterns("/login");

		registry.addInterceptor(adminInterceptor)
			.addPathPatterns("/admin/**")
			.excludePathPatterns("/hello");
	}
}
