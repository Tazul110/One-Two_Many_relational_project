package com.example.demo.sms.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class LaptopModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lid;
    private String m_name;
    
    @ManyToOne
    private Laptop laptop;

	public LaptopModel() {
		super();
	}

	public LaptopModel(long lid, String m_name, Laptop laptop) {
		super();
		this.lid = lid;
		this.m_name = m_name;
		this.laptop = laptop;
	}

	public long getLid() {
		return lid;
	}

	public void setLid(long lid) {
		this.lid = lid;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
    
    
}
