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

@Controller
@RequestMapping("/users")
public class UserController {
	@GetMapping(value="/")
	public String index(Model model)
	{
//		model.addAttribute("message", "Ko Học Lại");
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
		// fake data
		User user = new User();
		
		user.setMaSV("PH12321");
		user.setHoTen("Nguyen Van A");
		user.setEmail("anvph12345@fpt.edu.vn");
		user.setPassword("123456");
		user.setGioiTinh(1);
		user.setAvatar(null);
		user.setChuyenNganh("UDPM");
		user.setPhanQuyen(1);
		
		model.addAttribute("user", user);
		
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
