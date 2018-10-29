package com.test2.db.test2_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.test2.db.test2_db.entity.Allocazione;

import com.test2.db.test2_db.repositories.AllocazioneRepository;

@Service
@Transactional
public class AllocazioneBaseService {

	
	@Autowired
	AllocazioneRepository allocazioneRepository;


    //CRUD METHODS
    

}
