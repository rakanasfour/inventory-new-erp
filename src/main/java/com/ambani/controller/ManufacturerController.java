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

import com.ambani.model.Manufacturer;
import com.ambani.service.ManufacturerService;


@RestController
@RequestMapping("/api/manfacturer")
public class ManufacturerController {
	
	@Autowired
	 ManufacturerService manufacturerService;
	
	@GetMapping("/getAllManfacturer")
	public List<Manufacturer> getAllManfacturer(){
		
		
		return manufacturerService.getAllManfacturer();

	}
	
	
	@GetMapping("/getManfacturer/{id}")
	public Optional<Manufacturer> getManfacturer( @PathVariable("id") Long id){
		
		return manufacturerService.getManfacturer(id);

	}
	
    @PostMapping("/manufacturer")
	public void addManfacturer(@RequestBody  Manufacturer manufacturer ) {
		
    	
    	manufacturerService.addManfacturer(manufacturer);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deletemanfacturer(@PathVariable("id") Long id) {

		
	
		
		return  manufacturerService.deleteManufacturer(id);
	}
	
	
	
	@PutMapping("/update/{id}")
	public boolean updateManfacturer(@PathVariable("id")Long  id ,@RequestBody Manufacturer manfacturer) {
		manfacturer.setManufacturerId(id);
		return manufacturerService.updateManfacturer(manfacturer);
	}

	

}
