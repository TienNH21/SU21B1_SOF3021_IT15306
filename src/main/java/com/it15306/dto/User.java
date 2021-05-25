package com.it15306.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@NotNull(message="Họ Tên không được để trống")
	@NotBlank
	private String hoTen;

	@NotNull
	@NotBlank
	@Email
	private String email;

	@NotNull
	@NotBlank
	private String password;

	@NotNull
	@NotBlank
	private String maSV;

	@Null
	private String avatar;

	@NotNull
	@NotBlank
	private String chuyenNganh;

	@NotNull
	private Integer gioiTinh;

	@NotNull
	private Integer phanQuyen;
}
