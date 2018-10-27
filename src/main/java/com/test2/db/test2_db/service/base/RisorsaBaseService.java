package com.test2.db.test2_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.test2.db.test2_db.entity.Risorsa;

import com.test2.db.test2_db.entity.Tecnologia;

import com.test2.db.test2_db.repositories.RisorsaRepository;

@Service
@Transactional
public class RisorsaBaseService {

	
	@Autowired
	RisorsaRepository risorsaRepository;


    //CRUD METHODS
    
    //CRUD - CREATE
    
	public Risorsa insert(Risorsa risorsa) {
		return risorsaRepository.save(risorsa);
	}
	
	//CRUD - REMOVE
    
	public void delete(Long id) {
		risorsaRepository.delete(id);
	}

    
    public List<Risorsa> findByTecnologie(Tecnologia tecnologia){
		return risorsaRepository.findByTecnologie(tecnologia);
	}
    
	//CRUD - GET ONE
    	
	public Risorsa getOne(Long id) {
		return risorsaRepository.findOne(id);
	}

    	
    //CRUD - GET LIST
    	
	public List<Risorsa> getAll() {
		List<Risorsa> list = new ArrayList<>();
		risorsaRepository.findAll().forEach(list::add);
		return list;
	}
	

}
