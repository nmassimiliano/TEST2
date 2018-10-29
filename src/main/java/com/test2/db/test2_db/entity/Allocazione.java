package com.test2.db.test2_db.entity;

import javax.persistence.Entity;
import com.test2.db.test2_db.entity.base.AllocazioneBase;

@Entity
public class Allocazione extends AllocazioneBase {

    public Allocazione() {}

    public Allocazione(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
