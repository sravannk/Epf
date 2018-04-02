package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.Channel;
import com.mtvi.endpointprofile.domain.Endpoint;
import com.mtvi.endpointprofile.service.dto.ChannelDTO;
import com.mtvi.endpointprofile.service.dto.EndpointDTO;

@Mapper
public interface EndpointMapper {

	EndpointMapper INSTANCE = Mappers.getMapper( EndpointMapper.class );
	
	EndpointDTO toEndpointDTO(Endpoint endpointDomain);
	
	@InheritInverseConfiguration
	Endpoint fromEndpointDTO(EndpointDTO endpointDto);
}
