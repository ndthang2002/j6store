package com.thang.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.thang.entity.Sanpham;
import com.thang.jparepository.SanPhamRepository;

@CrossOrigin("*")
@RestController
public class SanphamRest {

	 @Autowired
	 SanPhamRepository sanphamjpa;
	@GetMapping("/rest/sanpham")
	public List<Sanpham> get (){
		return sanphamjpa.findAll();
	}
	
	@PostMapping("/rest/sanpham")
	public Sanpham create(@RequestBody Sanpham sanpham) {
		return sanphamjpa.save(sanpham);
	}
	@PutMapping("/rest/sanpham/{masp}")
	public Sanpham update(@RequestBody Sanpham sanpham) {
		
		return sanphamjpa.save(sanpham);
	}

}
