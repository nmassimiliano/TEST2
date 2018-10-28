package com.test2.db.test2_db.entity;

import javax.persistence.Entity;
import com.test2.db.test2_db.entity.base.FornitoreBase;

@Entity
public class Fornitore extends FornitoreBase {

    public Fornitore() {}

    public Fornitore(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
