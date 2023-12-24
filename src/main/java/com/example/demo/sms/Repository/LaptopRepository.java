package com.example.demo.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.sms.Model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long>
{
  
}
