package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cource;
import com.example.demo.service.CourceService;

@RestController
public class DemoController {
	
	@Autowired
	private CourceService courceservice;
	
	@GetMapping("/home")
	public String hello() {
		return "Welcome";
	}
	
	@GetMapping("/cources")
	public List<Cource>getCource(){
		return this.courceservice.getCource();
	}
	
	@GetMapping("/cources/{courceId}")
	public Cource getCource(@PathVariable String courceId) {
		return this.courceservice.getCource(Long.parseLong(courceId));
	}
	
	@PostMapping("/cources")
	public Cource addCource(@RequestBody Cource cource) {
		return this.courceservice.addCource(cource);
	}
	
	@PutMapping("/cources")
	public Cource updateCource(@RequestBody Cource cource) {
		return this.courceservice.updateCource(cource);
	}
	
	@DeleteMapping("/cources/{courceId}")
	public boolean deleteCource(@PathVariable String courceId) {
		return this.courceservice.deleteCource(Long.parseLong(courceId));
	}

}
