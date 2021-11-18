package com.demo.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserInfo {
	
	private int id;
	
	private String username;
	private String password;
	
	private Integer roleId;
	
	private String fullname;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date birthday;
	private String phone;
	private String email;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date created;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date updated;
	
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(int id, String username, String password, Integer roleId,  String fullname, Date birthday, String phone, String email,
			Date created, Date updated, boolean status) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.created = created;
		this.updated = updated;
		this.status = status;
	}
}
