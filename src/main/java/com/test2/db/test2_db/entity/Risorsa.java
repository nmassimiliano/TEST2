package com.test2.db.test2_db.entity;

import javax.persistence.Entity;
import com.test2.db.test2_db.entity.base.RisorsaBase;

@Entity
public class Risorsa extends RisorsaBase {

    public Risorsa() {}

    public Risorsa(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
