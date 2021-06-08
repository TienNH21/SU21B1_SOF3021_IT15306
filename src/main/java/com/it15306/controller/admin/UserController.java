package com.it15306.controller.admin;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it15306.dto.UserDTO;
import com.it15306.entity.User;
import com.it15306.libs.HashUtil;
import com.it15306.mappers.UserMapper;
import com.it15306.repositories.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserMapper mapper;

	@GetMapping(value="/")
	public String index(Model model)
	{
		List<com.it15306.entity.User> listUser = this.userRepo.findAll();
		model.addAttribute("listUser", listUser);
		return "admin/users/index";
	}

	@GetMapping(value="/{id}")
	public String show(
		Model model,
		@PathVariable(name="id") User entity
	) {
		UserDTO userDTO = mapper.convertToDTO(entity);		
		model.addAttribute("user", userDTO);
		return "";
	}

	@GetMapping(value="/create")
	public String create()
	{
		return "admin/users/create";
	}
	
	@PostMapping(value="/store")
	public String store(
		Model model,
		@Valid UserDTO user,
		BindingResult result
	) {
		// kiểm tra lỗi
		User entity = mapper.convertToEntity(user);
		
		String hashedPwd = HashUtil.hash(user.getPassword());
		entity.setPassword(hashedPwd);

		this.userRepo.save(entity);
		return "redirect:/users/";
	}

	@GetMapping(value="/edit/{id}")
	public String edit(
		@PathVariable("id") User entity,
		Model model
	) {
		UserDTO userDTO = mapper.convertToDTO(entity);		
		model.addAttribute("user", userDTO);
		
		return "admin/users/edit";
	}

	@PostMapping(value="/update/{id}")
	public String update(
		Model model,
		@Valid UserDTO user,
		BindingResult result
	) {
		if ( result.hasErrors() ) {
			List<ObjectError> errors = result.getAllErrors();

			System.out.println("true" + errors.get(0).getDefaultMessage());

			model.addAttribute("errors", errors);
//			return "redirect:/users/edit/1";
			return "admin/users/edit";
		} else {
			User entity = mapper.convertToEntity(user);

			this.userRepo.save(entity);
			return "redirect:/users/";
		}
	}

	@PostMapping(value="/delete/{id}")
	public String delete(@PathVariable("id") User entity)
	{
		this.userRepo.delete(entity);
		return "redirect:/users/";
	}
}
