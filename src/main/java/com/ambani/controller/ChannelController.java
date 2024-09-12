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

import com.ambani.model.Channel;
import com.ambani.service.ChannelService;


@RestController
@RequestMapping("/api/channel")
//@CrossOrigin(origins = "http://localhost:5173")
public class ChannelController {
	
	@Autowired
	 ChannelService channelService;
	
	@GetMapping("/getAllChannel")
	public List<Channel> getAllManfacturer(){
		
		
		return channelService.getAllChannel();

	}
	
	
	@GetMapping("/getChannel/{id}")
	public Optional<Channel> getChannel( @PathVariable("id") Long id){
		
		return channelService.getChannel(id);

	}
	
    @PostMapping("/channel")
	public void addChannel(@RequestBody  Channel channel ) {
		
    	
    	channelService.addChannel(channel);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteChannel(@PathVariable("id") Long id) {

		
	
		
		return  channelService.deleteChannel(id);
	}
	
	
	
	@PutMapping("/update/{id}")
	public boolean updateChannel(@PathVariable("id")Long  id ,@RequestBody Channel channel) {
		channel.setChannelId(id);
		return channelService.updateChannel(channel);
	}

	

}
