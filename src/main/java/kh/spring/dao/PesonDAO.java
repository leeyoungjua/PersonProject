package kh.spring.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.spring.dto.PersonDTO;

@Component
public class PesonDAO {
	
	@Autowired
	private SqlSession db;

	public int input(PersonDTO dto) {
		return db.insert("Person.insert",dto);
	}
	public List<PersonDTO> personList(){
		return db.selectList("Person.personAll");
	}
	

}
