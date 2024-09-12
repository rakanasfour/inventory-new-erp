package com.ambani.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambani.model.Channel;
import com.ambani.repository.ChannelRepository;
@Service
public class ChannelService {
	
	@Autowired
	ChannelRepository  channelRepository;
	
	public List<Channel> getAllChannel(){
		
		return channelRepository.findAll();
	}
	
	
public Optional<Channel> getChannel(Long id){
		
		return channelRepository.findById(id);
	}
	
	
	
	public void  addChannel(Channel channel){
			
			 channelRepository.save(channel);
		}
	
	
	public boolean deleteChannel(Long id) {
		
	    try {
	        channelRepository.deleteById(id);
	        return true;  // Delete was successful
	    } catch (Exception e) {
	        return false;  // Delete failed
	    }
	}
	
	
	public boolean updateChannel(Channel channel ){
		
			try {
				 channelRepository.save(channel);
				 return true;
			}
			catch(Exception e) {
				return false;
			}
		}
	
	
	
	
	
	

}
