package com.jsp.Thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.Thymeleaf.entity.Bat;
import com.jsp.Thymeleaf.service.batservice;

@Controller
public class batController {
	@Autowired
	batservice Service;
	
	@GetMapping("/add")
	public String addbat(Model model) {
     model.addAttribute("bat" , new Bat());
		return "reg.html";	
	}

	@PostMapping("/savebat")
	public String saveBat(Bat bat) {
		Service.saveBat(bat);
		return "succes.html";	
	}
	@GetMapping("/get")
	public String fetch(Model model){
		List<Bat> bats = Service.findall();
		model.addAttribute("batList", bats);
		return "FetchAll.html";
	
	}
	@GetMapping("/fetch/{id}")
	public String fetcById(@PathVariable int id , Model model) {
		Bat bat = Service.fetchById(id);
		model.addAttribute("batt", bat);
		return "Fetch.html";
	}
	@GetMapping("/delete/{id}")
	public String deleteById(@PathVariable int id, Model model) {
	String bat= Service.deleteById(id);
		model.addAttribute("bat", bat);
		return "delete.html";
	} 
	//open update page
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model) {
		Bat bat=Service.fetchById(id);
		model.addAttribute("bat",bat);
		return "update.html";
	}
	// update data
	@PostMapping("/update")
	public String updateBat(Bat bat) {
		Service.updateBat(bat);
		return "Succes.html";
	}
	
}

