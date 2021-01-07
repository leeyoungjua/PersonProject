package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dto.PersonDTO;
import kh.spring.services.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping("list.person")
	public String personList(Model model) {
		List<PersonDTO> list = service.personList();
		model.addAttribute("list", list);
		return "output";
	}
}
