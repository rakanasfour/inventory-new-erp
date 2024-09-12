package com.ambani.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambani.model.Manufacturer;
import com.ambani.model.ManufacturerFacility;
import com.ambani.repository.ManufacturerFacilityRepository;
import com.ambani.repository.ManufacturerRepository;
@Service
public class ManufacturerFacilityService {
	
	@Autowired
	ManufacturerFacilityRepository  manufacturerFacilityRepository;
	ManufacturerRepository  manufacturerRepository;

	
	public List<ManufacturerFacility> getAllManufacturerFacility(){
		
		return manufacturerFacilityRepository.findAll();
	}
	
	
public Optional<ManufacturerFacility> getManufacturerFacility(Long id){
		
		return manufacturerFacilityRepository.findById(id);
	}
	

	
	public void  addManufacturerFacility(ManufacturerFacility manufacturerFacility){
		
		Optional<Manufacturer> manufacturer = manufacturerRepository.findById(manufacturerFacility.getManufacturer().getManufacturerId());
		
		if(manufacturer.isPresent()){
			List<ManufacturerFacility> list= new ArrayList<>();
			list.add(manufacturerFacility);

			manufacturer.get().setManufacturerFacility(list);
			
		}
		 manufacturerFacilityRepository.save(manufacturerFacility);

		}
		
		
	
	
	public boolean deleteManufacturerFacility(Long id) {
		
	    try {
	        manufacturerFacilityRepository.deleteById(id);
	        return true;  // Delete was successful
	    } catch (Exception e) {
	        return false;  // Delete failed
	    }
	}
	
	
	public boolean updateManufacturerFacility(ManufacturerFacility manufacturerFacility ){
		
			try {
				 manufacturerFacilityRepository.save(manufacturerFacility);
				 return true;
			}
			catch(Exception e) {
				return false;
			}
		}
	
	
	
	
	
	

}
