package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.MaterialType;
import com.mtvi.endpointprofile.service.dto.MaterialTypeDTO;

@Mapper
public interface MaterialTypeMapper {
	
	MaterialTypeMapper INSTANCE = Mappers.getMapper( MaterialTypeMapper.class );

	
	
	MaterialTypeDTO toMaterialDTO(MaterialType materialTypeDomain);
	
	
	@InheritInverseConfiguration
	MaterialType fromMaterialDTO(MaterialTypeDTO materialTypeDto);
	
	
}
