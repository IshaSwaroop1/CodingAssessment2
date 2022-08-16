package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)	
	int id;
     @Column
	String catname;
	public CategoryEntity(int id, String catname) {
		super();
		this.id = id;
		this.catname = catname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", catname=" + catname + "]";
	}
}