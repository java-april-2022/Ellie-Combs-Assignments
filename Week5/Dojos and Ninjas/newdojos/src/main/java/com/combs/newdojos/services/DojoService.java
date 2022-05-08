package com.combs.newdojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.combs.newdojos.models.Dojo;
import com.combs.newdojos.repository.DojoRepo;

@Service
public class DojoService{
	
	//Adds the dojo repository as a dependency
	private final DojoRepo DojoRepository;
	
	public DojoService(DojoRepo dojoRepo) {
		this.DojoRepository = dojoRepo;
	}
	
	//Returns all the dojos
	public List<Dojo> allDojos() {
		return DojoRepository.findAll();
	}
	
	//Creates a dojo
	public Dojo createDojo(Dojo d) {
		return DojoRepository.save(d);
	}
	
	//Retrieves a dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = DojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	//Deletes 
	public void deleteDojo(Long id) {
		DojoRepository.deleteById(id);
	}
}
