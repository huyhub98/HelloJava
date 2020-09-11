package com.trungtamjava.master.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trungtamjava.master.hellospring.model.PersonDTO;
import com.trungtamjava.master.hellospring.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	//DI
//	@Autowired ///tu dong tim bean Person (p1) gan vao person
//	@Qualifier("p2")
//	PersonDTO personDTO;//null sau khi autowire -> p1
	
	@Autowired //tu dong tim cai bean PersonService
	PersonService personService;

	//	@GetMapping("/get") /// tuong duong
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String person(Model model, @RequestParam("id") int id) {
		//ban qua view
		model.addAttribute("p", personService.get(id));
		
		return "person";
	}
	
	@GetMapping("/list")
	public String personList() {
		
		return "person-list";
	}
}
