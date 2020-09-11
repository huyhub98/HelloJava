package com.trungtamjava.master.hellospring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trungtamjava.master.hellospring.dao.PhoneRepository;
import com.trungtamjava.master.hellospring.entity.PersonEntity;
import com.trungtamjava.master.hellospring.entity.PhoneEntity;
import com.trungtamjava.master.hellospring.model.PhoneDTO;

public interface PhoneService {

	void add(PhoneDTO p);

	void update(PhoneDTO PhoneDTO);

	void delete(int id);

	PhoneDTO get(int id);

	List<PhoneDTO> search(String keyword);

	List<PhoneDTO> searchByPersonName(String keyword);
}

@Service
@Transactional
class PhoneServiceImpl implements PhoneService {
	@Autowired
	private PhoneRepository phoneRepository;

	@Override
	public void add(PhoneDTO p) {
		/// doi dto - entity
		PhoneEntity phoneEntity = new PhoneEntity();
		
		phoneEntity.setPhoneNo(p.getPhoneNo());
		//THIEU O DAY 1 thuoc tinh personEntity de biet phone thuoc ve ai
		PersonEntity personEntity = new PersonEntity();
		personEntity.setId(p.getPersonId());//convert dto xuong
		
		phoneEntity.setPersonEntity(personEntity);
		
		phoneRepository.save(phoneEntity);
	}

	@Override
	public void update(PhoneDTO phoneDTO) {
		PhoneEntity phoneEntity = phoneRepository.getOne(phoneDTO.getId());
		if (phoneEntity != null) {
			phoneEntity.setPhoneNo(phoneDTO.getPhoneNo());
			//THIEU O DAY 1 thuoc tinh personEntity de biet phone thuoc ve ai
			PersonEntity personEntity = new PersonEntity();
			personEntity.setId(phoneDTO.getPersonId());//convert dto xuong
			
			phoneEntity.setPersonEntity(personEntity);
			
			phoneRepository.save(phoneEntity);
		}
	}

	@Override
	public void delete(int id) {
		PhoneEntity phoneEntity = phoneRepository.getOne(id);
		if (phoneEntity != null) {
			phoneRepository.delete(phoneEntity);
		}
	}

	@Override
	public PhoneDTO get(int id) {
		PhoneEntity phoneEntity = phoneRepository.getOne(id);
		if (phoneEntity != null) {
			PhoneDTO phoneDTO = new PhoneDTO();

			phoneDTO.setId(phoneEntity.getId());
			phoneDTO.setPhoneNo(phoneEntity.getPhoneNo());
			
			//dung load hibernate 
			phoneDTO.setPersonId(phoneEntity.getPersonEntity().getId());

			return phoneDTO;
		}

		return null;
	}

	@Override
	public List<PhoneDTO> search(String keyword) {
		List<PhoneDTO> phoneDTOs = new ArrayList<PhoneDTO>();

		// List<PhoneEntity> personEntities = personDao.search(keyword);
		List<PhoneEntity> personEntities = phoneRepository.search(keyword);

		for (PhoneEntity phoneEntity : personEntities) {
			PhoneDTO phoneDTO = new PhoneDTO();

			phoneDTO.setId(phoneEntity.getId());
			phoneDTO.setPhoneNo(phoneEntity.getPhoneNo());
			
			//dung load hibernate 
			phoneDTO.setPersonId(phoneEntity.getPersonEntity().getId());

			phoneDTOs.add(phoneDTO);
		}

		return phoneDTOs;
	}
	
	@Override
	public List<PhoneDTO> searchByPersonName(String keyword) {
		List<PhoneDTO> phoneDTOs = new ArrayList<PhoneDTO>();

		// List<PhoneEntity> personEntities = personDao.search(keyword);
		List<PhoneEntity> phoneEntities = phoneRepository.searchByPersonName(keyword);

		for (PhoneEntity phoneEntity : phoneEntities) {
			PhoneDTO phoneDTO = new PhoneDTO();

			phoneDTO.setId(phoneEntity.getId());
			phoneDTO.setPhoneNo(phoneEntity.getPhoneNo());
			
			//dung load hibernate 
			phoneDTO.setPersonId(phoneEntity.getPersonEntity().getId());

			phoneDTOs.add(phoneDTO);
		}

		return phoneDTOs;
	}
}
