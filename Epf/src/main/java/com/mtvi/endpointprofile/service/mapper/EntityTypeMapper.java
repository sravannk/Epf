package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.EntityType;
import com.mtvi.endpointprofile.service.dto.EntityTypeDTO;

@Mapper
public interface EntityTypeMapper {

	EntityTypeMapper INSTANCE = Mappers.getMapper( EntityTypeMapper.class );
	
	
	EntityTypeDTO toEntityTypeDTO(EntityType entitytypeDomain);
	
	@InheritInverseConfiguration
	EntityType fromEntityType(EntityTypeDTO entitytypeDto);
	
}
