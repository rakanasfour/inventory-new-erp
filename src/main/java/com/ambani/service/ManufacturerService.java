package com.ambani.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambani.model.Manufacturer;
import com.ambani.repository.ManufacturerRepository;
@Service
public class ManufacturerService {
	
	@Autowired
	ManufacturerRepository  manufacturerRepository;
	
	public List<Manufacturer> getAllManfacturer(){
		
		return manufacturerRepository.findAll();
	}
	
	
public Optional<Manufacturer> getManfacturer(Long id){
		
		return manufacturerRepository.findById(id);
	}
	
	
	
	public void  addManfacturer(Manufacturer manufacturer){
			
			 manufacturerRepository.save(manufacturer);
		}
	
	
	public boolean deleteManufacturer(Long id) {
		
	    try {
	        manufacturerRepository.deleteById(id);
	        return true;  // Delete was successful
	    } catch (Exception e) {
	        return false;  // Delete failed
	    }
	}
	
	
	public boolean updateManfacturer(Manufacturer manufacturer ){
		
			try {
				 manufacturerRepository.save(manufacturer);
				 return true;
			}
			catch(Exception e) {
				return false;
			}
		}
	
	
	
	
	
	

}
