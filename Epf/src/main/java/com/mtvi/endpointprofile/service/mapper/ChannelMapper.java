package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.Channel;
import com.mtvi.endpointprofile.service.dto.ChannelDTO;

@Mapper
public interface ChannelMapper {
	
	ChannelMapper INSTANCE = Mappers.getMapper( ChannelMapper.class );

	ChannelDTO toChannelDTO(Channel channelDomain);
	
	@InheritInverseConfiguration
	Channel fromChannelDTO(ChannelDTO channelDto);
}
