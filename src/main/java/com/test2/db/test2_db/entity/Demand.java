package com.test2.db.test2_db.entity;

import javax.persistence.Entity;
import com.test2.db.test2_db.entity.base.DemandBase;

@Entity
public class Demand extends DemandBase {

    public Demand() {}

    public Demand(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
