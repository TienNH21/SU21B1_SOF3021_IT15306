package com.it15306.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.it15306.dto.UserDTO;
import com.it15306.entity.User;

@Component
public class UserMapper {
	@Autowired
	private ModelMapper mapper;
	
	public User convertToEntity(UserDTO userDTO) {
		User entity = new User();
		
		mapper.map(userDTO, entity);

		return entity;
	}
	
	public UserDTO convertToDTO(User entity) {
		UserDTO userDTO = new UserDTO();
		mapper.map(entity, userDTO);
		return userDTO;
	}
}
