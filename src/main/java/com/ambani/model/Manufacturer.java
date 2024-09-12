package com.ambani.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="manufacturer")
@Entity
public class Manufacturer {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manufacturer_id")
	private Long manufacturerId ;
	
	@Column(name="description",length=99)
	private String description;
	
	
	@Column(name="manufacturer_name", length=99)
	private String manufacturerName;
	
	@OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ManufacturerFacility> manufacturerFacility = new ArrayList<>();
	
	

	public Manufacturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public List<ManufacturerFacility> getManufacturerFacility() {
		return manufacturerFacility;
	}

	public void setManufacturerFacility(List<ManufacturerFacility> manufacturerFacility) {
		this.manufacturerFacility = manufacturerFacility;
	}

	
	 

	 
	 
	 

 




}
