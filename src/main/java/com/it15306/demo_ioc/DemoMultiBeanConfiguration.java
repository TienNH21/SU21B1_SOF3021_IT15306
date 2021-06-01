package com.it15306.demo_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.it15306.dto.User;

@Configuration
public class DemoMultiBeanConfiguration {
	@Bean("beanTienNH21")
	public User getUser1()
	{
		User myUser = new User();
		myUser.setHoTen("TienNH21");
		return myUser;
	}

	@Bean("beanDungNA29")
	public User getUser2()
	{
		User myUser = new User();
		myUser.setHoTen("DungNA29");
		return myUser;
	}
}
