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
import com.test2.db.test2_db.service.DemandService;
import com.test2.db.test2_db.entity.Demand;
import com.test2.db.test2_db.dtos.DemandDto;

//IMPORT RELATIONS


public class DemandBaseController {
    
    @Autowired
	DemandService demandService;

	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS



/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private DemandDto convertToDto(Demand demand) {
		DemandDto demandDto = modelMapper.map(demand, DemandDto.class);
		return demandDto;
	}
}
