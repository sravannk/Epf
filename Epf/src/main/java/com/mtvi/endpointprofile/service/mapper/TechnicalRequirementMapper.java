package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TechnicalRequirementMapper {
	
	TechnicalRequirementMapper INSTANCE = Mappers.getMapper( TechnicalRequirementMapper.class );

	
	
}
