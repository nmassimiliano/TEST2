package com.test2.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.modelmapper.ModelMapper;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.test2.db.test2_db.service.FornitoreService;
import com.test2.db.test2_db.entity.Fornitore;
import com.test2.db.test2_db.dtos.FornitoreDto;

import com.test2.db.test2_db.entity.Risorsa;

//IMPORT RELATIONS

import com.test2.db.test2_db.service.RisorsaService;


public class FornitoreBaseController {
    
    @Autowired
	FornitoreService fornitoreService;

	
	@Autowired
	RisorsaService risorsaService;
	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS


    //CRUD - CREATE
    @Secured({ "ROLE_PRIVATE_USER" })
	@PostMapping("/fornitores")
	public ResponseEntity<FornitoreDto> insert(@RequestBody Fornitore obj) {
				
		//external relation risorse
		if (obj.getRisorse() != null) {
			if (obj.getRisorse().get_id() == null)
				risorsaService.insert(obj.getRisorse());
			else
				risorsaService.insert(risorsaService.getOne(obj.getRisorse().get_id()));
		}
				
		
		return ResponseEntity.ok().body(convertToDto(fornitoreService.insert(obj)));
	}

	
    //CRUD - REMOVE
    @Secured({ "ROLE_PRIVATE_USER" })
	@DeleteMapping("/fornitores/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		Fornitore fornitoreSelected = fornitoreService.getOne(id);
		
		
		fornitoreService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
    //CRUD - GET ONE
    @Secured({ "ROLE_PRIVATE_USER" })
	@GetMapping("/fornitores/{id}")
	public ResponseEntity<FornitoreDto> get(@PathVariable("id") Long id) {
		Fornitore fornitoreSelected = fornitoreService.getOne(id);
		return ResponseEntity.ok().body(convertToDto(fornitoreSelected));
	}
	
	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@GetMapping("/fornitores")
	public ResponseEntity<List<FornitoreDto>> getList() {
		List<Fornitore> list = fornitoreService.getAll();
		List<FornitoreDto> listDto = list.stream()
				.map(fornitore -> convertToDto(fornitore))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}


    //CRUD - EDIT
    @Secured({ "ROLE_PRIVATE_USER" })
	@PostMapping("/fornitores/{id}")
	public ResponseEntity<FornitoreDto> update(@RequestBody Fornitore obj, @PathVariable("id") Long id) {
	    
		//external relation risorse
		if (obj.getRisorse() != null) {
			if (obj.getRisorse().get_id() == null)
				risorsaService.insert(obj.getRisorse());
			else
				risorsaService.insert(risorsaService.getOne(obj.getRisorse().get_id()));
		}
				
		
		return ResponseEntity.ok().body(convertToDto(fornitoreService.insert(obj)));
	}
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private FornitoreDto convertToDto(Fornitore fornitore) {
		FornitoreDto fornitoreDto = modelMapper.map(fornitore, FornitoreDto.class);
		return fornitoreDto;
	}
}
