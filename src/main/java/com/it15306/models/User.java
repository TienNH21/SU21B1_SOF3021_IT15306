package com.it15306.models;

public class User {
	private String hoTen;
	private String email;
	private String password;
	private String maSV;
	private String avatar;
	private String chuyenNganh;
	private Integer gioiTinh;
	private Integer phanQuyen;

	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getMaSV() {
		return maSV;
	}
	
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	
	public String getAvatar() {
		return avatar;
	}
	
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	
	public Integer getGioiTinh() {
		return gioiTinh;
	}
	
	public void setGioiTinh(Integer gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Integer getPhanQuyen() {
		return phanQuyen;
	}

	public void setPhanQuyen(Integer phanQuyen) {
		this.phanQuyen = phanQuyen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
