package com.ambani.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambani.model.ManufacturerFacility;
import com.ambani.service.ManufacturerFacilityService;


@RestController
@RequestMapping("/api/manufacturerfacility")
public class ManufacturerFacilityController {
	
	@Autowired
	 ManufacturerFacilityService manufacturerFacilityService;
	
	@GetMapping("/getAllManufacturerFacility")
	public List<ManufacturerFacility> getAllManufacturerFacility(){
		
		
		return manufacturerFacilityService.getAllManufacturerFacility();

	}
	
	
	@GetMapping("/getManufacturerFacility/{id}")
	public Optional<ManufacturerFacility> getManufacturerFacility( @PathVariable("id") Long id){
		
		return manufacturerFacilityService.getManufacturerFacility(id);

	}
	
    @PostMapping("/manufacturerFacility")
	public void addManufacturerFacility(@RequestBody  ManufacturerFacility manufacturerFacility ) {
		
    	
    	manufacturerFacilityService.addManufacturerFacility(manufacturerFacility);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteManufacturerFacility(@PathVariable("id") Long id) {

		
	
		
		return  manufacturerFacilityService.deleteManufacturerFacility(id);
	}
	
	
	
	@PutMapping("/update/{id}")
	public boolean updatemanufacturerFacility(@PathVariable("id")Long  id ,@RequestBody ManufacturerFacility manufacturerFacility) {
		manufacturerFacility.setManufacturerFacilityId(id);
		return manufacturerFacilityService.updateManufacturerFacility(manufacturerFacility);
	}

	

}
