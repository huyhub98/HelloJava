package com.trungtamjava.master.hellospring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.trungtamjava.master.hellospring.dao.PersonDao;
import com.trungtamjava.master.hellospring.dao.PersonRepository;
import com.trungtamjava.master.hellospring.entity.PersonEntity;
import com.trungtamjava.master.hellospring.entity.PhoneEntity;
import com.trungtamjava.master.hellospring.model.PersonDTO;
import com.trungtamjava.master.hellospring.model.PhoneDTO;

public interface PersonService {

	void add(PersonDTO p);

	void update(PersonDTO personDTO);

	void delete(int id);

	PersonDTO get(int id);

	List<PersonDTO> search(String keyword);
}

@Service
@Transactional
class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void add(PersonDTO p) {
		System.out.println("Add person");
		/// doi dto - entity

		PersonEntity personEntity = new PersonEntity();
		personEntity.setId(p.getId());
		personEntity.setName(p.getName());
		
		//them encode mat khau truoc khi luu
		personEntity.setPassword(new BCryptPasswordEncoder().encode(p.getPassword()));
		// co the dung
		// BeanUtils.copyProperties(p, personEntity);
		//personDao.add(personEntity);
		personRepository.save(personEntity);
		/// tra ve ID cho controller
		p.setId(personEntity.getId());
	}

	@Override
	public void update(PersonDTO personDTO) {
		PersonEntity personEntity = personDao.get(personDTO.getId());
		if (personEntity != null) {
			personEntity.setName(personDTO.getName());
//			personDao.update(personEntity);
			personRepository.save(personEntity);
		}
	}

	@Override
	public void delete(int id) {
		PersonEntity personEntity = personDao.get(id);
		if (personEntity != null) {
			personDao.delete(personEntity);
		}
	}

	@Override
	public PersonDTO get(int id) {
		PersonEntity personEntity = personDao.get(id);
		if (personEntity != null) {
			PersonDTO personDTO = new PersonDTO();

			personDTO.setId(personEntity.getId());
			personDTO.setName(personEntity.getName());
			
			//dung lay nhanh ra list phone
			List<PhoneEntity> phoneEntities = personEntity.getPhoneEntities();
			
			//convert phoneentity -> phoneDTO
			List<PhoneDTO> phoneDTOs = new ArrayList<PhoneDTO>();

			for (PhoneEntity phoneEntity : phoneEntities) {
				PhoneDTO phoneDTO = new PhoneDTO();

				phoneDTO.setId(phoneEntity.getId());
				phoneDTO.setPhoneNo(phoneEntity.getPhoneNo());
				
				phoneDTOs.add(phoneDTO);
			}
			
			personDTO.setPhoneDTOs(phoneDTOs);//set vao persondto phone list
			
			return personDTO;
		}

		return null;
	}

	@Override
	public List<PersonDTO> search(String keyword) {
		List<PersonDTO> personDTOs = new ArrayList<PersonDTO>();

		//List<PersonEntity> personEntities = personDao.search(keyword);
		List<PersonEntity> personEntities = personRepository.search(keyword);
		
		for (PersonEntity personEntity : personEntities) {
			PersonDTO personDTO = new PersonDTO();

			personDTO.setId(personEntity.getId());
			personDTO.setName(personEntity.getName());
			
			personDTOs.add(personDTO);
		}

		return personDTOs;
	}
}
