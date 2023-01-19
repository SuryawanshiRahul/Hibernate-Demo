package com.infogalaxy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courseinfo")
public class Students {
	@Id
	@Column(name = "cid")
	private int id;
	
	@Column(name = "cname")
	private String name;
	
	@Column(name = "cfees")
	private int fees;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	

}
