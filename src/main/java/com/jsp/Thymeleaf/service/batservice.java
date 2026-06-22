package com.jsp.Thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Thymeleaf.entity.Bat;
import com.jsp.Thymeleaf.repository.batrepository;

@Service
public class batservice {
	@Autowired
	batrepository batrepo;	
	public Bat saveBat(Bat bat) {
		return batrepo.save(bat);
	}

	public List<Bat> findall(){
		return batrepo.findAll();
	}

	public Bat fetchById(int id) {
		Optional<Bat> ba=batrepo.findById(id);
		if(ba.isPresent()) {
			return ba.get();
		}
		else {
			return null;	
		}
	}
	public	String deleteById(int id) {
		if(batrepo.existsById(id)) {
			batrepo.deleteById(id);
			return " Data deleted Succesfully";
		}else {
			return "Id not Found";
		}
	}
	public Bat updateBat(Bat bat) {
		Bat bat1=batrepo.findById(bat.getId()).orElse(null);
		if(bat1!=null) {
			bat1.setBrand(bat.getBrand());
			bat1.setOwner(bat.getOwner());
			bat1.setPrice(bat.getPrice());
			
			return batrepo.save(bat1);
		}
		return null;
	}
}
