package com.it15306.controller.admin;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String edit(@PathVariable("id") Integer id)
	{
		return "admin/users/edit";
	}

	@PostMapping(value="/update/{id}")
	public String update(@PathVariable("id") Integer id)
	{
		// Xử lý ...
		return "redirect:/users/";
	}

	@PostMapping(value="/delete/{id}")
	public String delete(@PathVariable("id") Integer id)
	{
		// Xử lý ...
		return "redirect:/users/";
	}
}
