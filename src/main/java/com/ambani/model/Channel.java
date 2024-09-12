package com.ambani.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="channel")
public class Channel {
	
	public enum ChannelDescription{
		OPTION1, OPTION2
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="channel_id")
	private Long channelId;
	@Enumerated(EnumType.STRING)
	@Column(name="channel_description",length=250)
	private ChannelDescription channelDescription;
	
	

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public ChannelDescription getChannelDescription() {
		return channelDescription;
	}

	public void setChannelDescription(ChannelDescription channelDescription) {
		this.channelDescription = channelDescription;
	}
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	

}
