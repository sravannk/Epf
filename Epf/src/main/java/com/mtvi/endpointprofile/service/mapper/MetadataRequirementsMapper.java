package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.MetadataRequirements;
import com.mtvi.endpointprofile.service.dto.MetadataRequirementsDTO;

@Mapper
public interface MetadataRequirementsMapper {
	
	MetadataRequirementsMapper INSTANCE=Mappers.getMapper(MetadataRequirementsMapper.class);

	MetadataRequirementsDTO toMetadataRequirementsDto(MetadataRequirements metadataRequirementsDomain);
	
	@InheritInverseConfiguration
	MetadataRequirements fromMetadataRequirementsDto(MetadataRequirementsDTO metadataRequirementsDto);
	
	
}
