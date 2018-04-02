package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.FallbackMaterial;
import com.mtvi.endpointprofile.service.dto.FallbackMaterialDTO;

@Mapper
public interface FallbackMaterialMapper {
	
	FallbackMaterialMapper INSTANCE=Mappers.getMapper(FallbackMaterialMapper.class);
	
	FallbackMaterialDTO toFallbackMaterialDto(FallbackMaterial fallbackMaterialDomain);
	
	@InheritInverseConfiguration
	FallbackMaterial fromFallbackMaterialDto(FallbackMaterialDTO fallbackMaterialDto);
	
	

}
