package com.test2.db.test2_db.dtos.base;

/**
 * 
 * 
  _____                      _              _ _ _     _   _     _        __ _ _      
 |  __ \                    | |            | (_) |   | | | |   (_)      / _(_) |     
 | |  | | ___    _ __   ___ | |_    ___  __| |_| |_  | |_| |__  _ ___  | |_ _| | ___ 
 | |  | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | __| '_ \| / __| |  _| | |/ _ \
 | |__| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  | |_| | | | \__ \ | | | | |  __/
 |_____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__|  \__|_| |_|_|___/ |_| |_|_|\___|
 
                                                                                   
 * DO NOT EDIT THIS FILE!! 
 *
 *  FOR CUSTOMIZE FornitoreBaseDto PLEASE EDIT ../FornitoreDto.java
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER CODE GENERATION --
 * 
 */
 

/**
 * This is the dto of Fornitore object
 * 
 */

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.test2.db.test2_db.entity.Fornitore;
// Import relations
import com.test2.db.test2_db.dtos.infos.RisorsaInfo;



public class FornitoreBaseDto {
	
	private Long _id;
	
	// Attributes
    private String commerciale;
    private String nominativo;
	
	// Relations risorse
	private Long risorse;
	
	
	
	public Long get_id() {
		return _id;
	}

	public void set_id(Long id) {
		this._id = id;
	}
	
	public String getCommerciale() {
		return commerciale;
	}

	public void setCommerciale(String commerciale) {
		this.commerciale = commerciale;
	}
	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
    
	public void setRisorse(RisorsaInfo risorse) {
		this.risorse = risorse.get_id();
	}

	public Long getRisorse() {
		return risorse;
	}
	

    
}