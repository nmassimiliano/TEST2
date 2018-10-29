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
import com.test2.db.test2_db.service.AllocazioneService;
import com.test2.db.test2_db.entity.Allocazione;
import com.test2.db.test2_db.dtos.AllocazioneDto;

//IMPORT RELATIONS


public class AllocazioneBaseController {
    
    @Autowired
	AllocazioneService allocazioneService;

	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS



/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private AllocazioneDto convertToDto(Allocazione allocazione) {
		AllocazioneDto allocazioneDto = modelMapper.map(allocazione, AllocazioneDto.class);
		return allocazioneDto;
	}
}
