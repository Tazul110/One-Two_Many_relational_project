package com.example.demo.sms.Model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Laptop {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lid;
    private String lname;

    @ManyToOne  
    private Student student;
    
    @OneToMany(mappedBy = "laptop")
    private List<LaptopModel> laptopModels;

	public Laptop() {
		super();
	}

	
	public Laptop(long lid, String lname, Student student, List<LaptopModel> laptopModels) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.student = student;
		this.laptopModels = laptopModels;
	}


	public long getLid() {
		return lid;
	}

	public void setLid(long lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public List<LaptopModel> getLaptopModels() {
		return laptopModels;
	}


	public void setLaptopModels(List<LaptopModel> laptopModels) {
		this.laptopModels = laptopModels;
	}

    
    
    
}