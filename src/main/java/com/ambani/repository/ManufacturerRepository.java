package com.ambani.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambani.model.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

}
