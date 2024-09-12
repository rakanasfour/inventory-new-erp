package com.ambani.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="manufacturer_facility")
public class ManufacturerFacility {
	
	public enum FacilityCountry{
		
		USA, CANADA, UK, GERMANY, FRANCE, CHINA, INDIA
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manufacturer_facility_id")
	private Long manufacturerFacilityId;
	
	
	@Column(name="facility_name",length=99)
	private String facilityName;
	
	@Enumerated(EnumType.STRING)
	@Column(name="facility_country", nullable = false)
	private FacilityCountry facilityCountry;

	

	//@ManyToOne
	@ManyToOne(fetch = FetchType.EAGER)

	//@JoinColumn(name="manufacturer_id")
	@JoinColumn(name="manufacturer_id")

	    private Manufacturer manufacturer;



	public ManufacturerFacility() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getManufacturerFacilityId() {
		return manufacturerFacilityId;
	}



	public void setManufacturerFacilityId(Long manufacturerFacilityId) {
		this.manufacturerFacilityId = manufacturerFacilityId;
	}



	public String getFacilityName() {
		return facilityName;
	}



	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}



	public FacilityCountry getFacilityCountry() {
		return facilityCountry;
	}



	public void setFacilityCountry(FacilityCountry facilityCountry) {
		this.facilityCountry = facilityCountry;
	}



	public Manufacturer getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}



	
	
	

}
