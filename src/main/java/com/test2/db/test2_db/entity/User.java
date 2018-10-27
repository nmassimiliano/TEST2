package com.test2.db.test2_db.entity;

import javax.persistence.Entity;
import com.test2.db.test2_db.entity.base.UserBase;

@Entity(name="user_app")
public class User extends UserBase {

    public User() {}

    public User(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
