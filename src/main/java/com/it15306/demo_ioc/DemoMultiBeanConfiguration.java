package com.it15306.demo_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.it15306.dto.UserDTO;

@Configuration
public class DemoMultiBeanConfiguration {
	@Bean("beanTienNH21")
	public UserDTO getUser1()
	{
		UserDTO myUser = new UserDTO();
//		myUser.setHoTen("TienNH21");
		return myUser;
	}

	@Bean("beanDungNA29")
	public UserDTO getUser2()
	{
		UserDTO myUser = new UserDTO();
//		myUser.setHoTen("DungNA29");
		return myUser;
	}
}
