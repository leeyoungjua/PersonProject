package kh.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.PersonDAO;
import kh.spring.dto.PersonDTO;

@Service
public class PersonService {
	
	@Autowired
	private PersonDAO dao;
	
	public List<PersonDTO> personList(){
		return dao.personList();
	}
}
