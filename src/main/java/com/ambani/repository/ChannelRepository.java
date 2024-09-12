package com.ambani.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambani.model.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
	

}
