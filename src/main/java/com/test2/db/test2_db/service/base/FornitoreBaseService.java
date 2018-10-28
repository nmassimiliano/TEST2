package com.test2.db.test2_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.test2.db.test2_db.entity.Fornitore;

import com.test2.db.test2_db.entity.Risorsa;

import com.test2.db.test2_db.repositories.FornitoreRepository;

@Service
@Transactional
public class FornitoreBaseService {

	
	@Autowired
	FornitoreRepository fornitoreRepository;


    //CRUD METHODS
    
    //CRUD - CREATE
    
	public Fornitore insert(Fornitore fornitore) {
		return fornitoreRepository.save(fornitore);
	}
	
	//CRUD - REMOVE
    
	public void delete(Long id) {
		fornitoreRepository.delete(id);
	}

	//CRUD - GET ONE
    	
	public Fornitore getOne(Long id) {
		return fornitoreRepository.findOne(id);
	}

    	
    //CRUD - GET LIST
    	
	public List<Fornitore> getAll() {
		List<Fornitore> list = new ArrayList<>();
		fornitoreRepository.findAll().forEach(list::add);
		return list;
	}
	

}
