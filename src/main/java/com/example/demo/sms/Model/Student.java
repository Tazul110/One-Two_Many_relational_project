package com.example.demo.sms.Model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
    
	@Id
    private String id;
    private String name;
    private String phone;

    @OneToMany(mappedBy = "student")
    private List<Laptop> laptops;     // =new ArrayList<Laptop>();

	public Student() {
		super();
	}

	public Student(String id, String name, String phone, List<Laptop> laptops) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.laptops = laptops;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

    // getters and setters
    
    
}