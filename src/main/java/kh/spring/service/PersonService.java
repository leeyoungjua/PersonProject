package kh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.PesonDAO;
import kh.spring.dto.PersonDTO;

@Service
public class PersonService {
	
	@Autowired
	private PesonDAO pdao;

	public int input(PersonDTO dto) {
		return pdao.input(dto);
	}

	public List<PersonDTO> personList() {
		return pdao.personList();
	}

}
