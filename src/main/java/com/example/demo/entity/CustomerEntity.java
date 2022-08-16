package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
  int id;
	@Column
  String cuname;
	@Column
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCuname() {
		return cuname;
	}
	public void setCuname(String cuname) {
		this.cuname = cuname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerEntity(int id, String cuname, String address) {
		super();
		this.id = id;
		this.cuname = cuname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", cuname=" + cuname + ", address=" + address + "]";
	}
}