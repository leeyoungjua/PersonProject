package kh.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dto.PersonDTO;
import kh.spring.service.PersonService;


@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "input.person", produces = "text/plain; charset=UTF8")
	public String input(PersonDTO dto) {
		int result = personService.input(dto);
		System.out.println(result);
		return "home";
	}
	@RequestMapping("list.person")
	public String personList(Model model) {
		List<PersonDTO> list = personService.personList();
		model.addAttribute("list", list);
		return "output";
	}
	

}
