package com.test2.db.test2_db.entity;

import javax.persistence.Entity;
import com.test2.db.test2_db.entity.base.TecnologiaBase;

@Entity
public class Tecnologia extends TecnologiaBase {

    public Tecnologia() {}

    public Tecnologia(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
