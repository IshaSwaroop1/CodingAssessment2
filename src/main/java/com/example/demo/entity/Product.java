package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
 int id;
	@Column
 String pname;
	@Column
 String color;
	@Column
 String price;
	@OneToOne(cascade=CascadeType.PERSIST)
	CategoryEntity CaEn;
	@OneToOne(cascade=CascadeType.PERSIST)
	MerchantEntity MeEN;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPName() {
		return pname;
	}
	public void setPName(String name) {
		this.pname = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public CategoryEntity getCaEn() {
		return CaEn;
	}
	public void setCaEn(CategoryEntity caEn) {
		CaEn = caEn;
	}
	public MerchantEntity getMeEN() {
		return MeEN;
	}
	public void setMeEN(MerchantEntity meEN) {
		MeEN = meEN;
	}
	public Product(int id, String pname, String color, String price, CategoryEntity caEn, MerchantEntity meEN) {
		super();
		this.id = id;
		this.pname = pname;
		this.color = color;
		this.price = price;
		CaEn = caEn;
		MeEN = meEN;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + pname + ", color=" + color + ", price=" + price + ", CaEn=" + CaEn
				+ ", MeEN=" + MeEN + "]";
	}
}