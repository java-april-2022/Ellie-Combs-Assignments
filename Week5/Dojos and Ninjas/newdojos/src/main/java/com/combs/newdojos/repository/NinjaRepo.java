package com.combs.newdojos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.combs.newdojos.models.Dojo;
import com.combs.newdojos.models.Ninja;

//Method retrieves all ninjas from the database
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
		List<Ninja> findAllByDojo(Dojo dojo);
}
