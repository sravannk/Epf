package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.MaterialMetadataRequirements;
import com.mtvi.endpointprofile.service.dto.MaterialMetadataRequirementsDTO;

@Mapper(uses= {MetadataRequirementsMapper.class,MaterialMapper.class})
public interface MaterialMetadataRequirementsMapper {
	
	MaterialMetadataRequirementsMapper INSTANCE=Mappers.getMapper(MaterialMetadataRequirementsMapper.class);
	
	MaterialMetadataRequirementsDTO toMatMetaDataRequirementsDto(MaterialMetadataRequirements matMetaDataRequirementsDomain);
	
	@InheritInverseConfiguration
	MaterialMetadataRequirements fromMatMetaDataRequirementsDto(MaterialMetadataRequirementsDTO matMetaDataRequirementsDto);
	

}
