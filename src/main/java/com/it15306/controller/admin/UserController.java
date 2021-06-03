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

import com.it15306.dto.User;
import com.it15306.repositories.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepo;

	@GetMapping(value="/")
	public String index(Model model)
	{
		List<com.it15306.entity.User> listUser = this.userRepo.findAll();
		model.addAttribute("listUser", listUser);
		return "admin/users/index";
	}

	@GetMapping(value="/{id}")
	public String show(
		@PathVariable(name="id") Integer id
	) {
		System.out.println("----" + id);
		return "";
	}

	@GetMapping(value="/create")
	public String create()
	{
		return "admin/users/create";
	}
	
	@PostMapping(value="/store")
	public String store()
	{
		// Xử lý ...
		return "redirect:/users/";
	}

	@GetMapping(value="/edit/{id}")
	public String edit(
		@PathVariable("id") Integer id,
		Model model
	) {
		com.it15306.entity.User entity = this.userRepo.getOne(id);
		User userDTO = new User();
		
		// ModelMapper
		// https://mvnrepository.com/artifact/org.modelmapper/modelmapper/2.4.4
		userDTO.setUsername(entity.getUsername());
		userDTO.setEmail(entity.getEmail());
		userDTO.setPassword(entity.getPassword());
		userDTO.setPhoto(entity.getPhoto());
		userDTO.setActivated(entity.getActivated());
		userDTO.setAdmin(entity.getAdmin());
		
		model.addAttribute("user", userDTO);
		
		return "admin/users/edit";
	}

	@PostMapping(value="/update/{id}")
	public String update(
		Model model,
		@Valid User user,
		BindingResult result
	) {
		if ( result.hasErrors() ) {
			List<ObjectError> errors = result.getAllErrors();

			System.out.println("true" + errors.get(0).getDefaultMessage());

			model.addAttribute("errors", errors);
//			return "redirect:/users/edit/1";
			return "admin/users/edit";
		} else {
			System.out.println("false");
			return "redirect:/users/";
		}
	}

	@PostMapping(value="/delete/{id}")
	public String delete(@PathVariable("id") Integer id)
	{
		// Xử lý ...
		return "redirect:/users/";
	}
}
