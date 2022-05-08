package com.combs.newdojos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.combs.newdojos.models.Dojo;

//Method retrieves all dojos from database
@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
