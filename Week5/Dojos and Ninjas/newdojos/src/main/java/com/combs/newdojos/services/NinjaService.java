package com.combs.newdojos.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.combs.newdojos.models.Dojo;
import com.combs.newdojos.models.Ninja;
import com.combs.newdojos.repository.NinjaRepo;

@Service
public class NinjaService {
	
	//Adds the ninja repository as a dependency
    private final NinjaRepo NinjaRepository;
    
    public NinjaService(NinjaRepo ninjaRepo) {
        this.NinjaRepository = ninjaRepo;
    }
    
    // returns all the ninjas
    public List<Ninja> allNinja() {
        return NinjaRepository.findAll();
    }
    
    // Creates a ninja
    public Ninja createNinja(Ninja d) {
        return NinjaRepository.save(d);
    }
    
    // retrieves a ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja =  NinjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    //Deletes
    public void deleteNinja(Long id) {
    	NinjaRepository.deleteById(id);
    	
    }
    
   //
    public List<Ninja>findDojoNinjas(Dojo dojo){
		return NinjaRepository.findAllByDojo(dojo);
    	
    }

}
