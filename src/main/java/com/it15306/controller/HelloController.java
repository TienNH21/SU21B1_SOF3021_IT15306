package com.it15306.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.it15306.dto.UserDTO;

@Controller
public class HelloController {
	@Autowired
	@Qualifier("beanDungNA29")
	private UserDTO user;

	@Autowired
	private ServletContext app;
	
	@RequestMapping("/hello")
	public String index() {
		return "hello";
	}
	
	@PostMapping("/hello-upload")
	public String upload(
		@RequestParam MultipartFile uploadedFile
	) {
		File myUploadFolder = new File("/Users/tiennh/eclipse-workspace/SOF3021_IT15306/src/main/webapp/storages");

		// /Users/tiennh/eclipse-workspace/SOF3021_IT15306/src/main/webapp/storages/excels/abc.xlsx
		// Nếu folder lưu file ko tồn tại -> tạo mới
		if (!myUploadFolder.exists()) {
			myUploadFolder.mkdirs();
		}

		// Ghi file đã upload vào thư mục lưu trữ file
		File savedFile = new File(myUploadFolder, uploadedFile.getOriginalFilename());
		try {
			uploadedFile.transferTo(savedFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/hello";
	}
	
	@GetMapping("/hello-api")
	@ResponseBody
	public String helloApi()
	{
		return "Hello Ong học lại!";
	}
}
