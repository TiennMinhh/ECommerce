package com.demo.models;
// Generated Nov 24, 2021, 4:10:46 PM by Hibernate Tools 5.1.10.Final


/**
 * Roles generated by hbm2java
 */
public class RoleInfo{

	private Integer id;
	private String name;
	private boolean status;

	public RoleInfo() {
	}
	

	public RoleInfo(Integer id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
