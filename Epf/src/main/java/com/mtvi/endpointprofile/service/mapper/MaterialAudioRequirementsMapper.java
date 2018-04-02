package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.MaterialAudioRequirements;
import com.mtvi.endpointprofile.service.dto.MaterialAudioRequirementsDTO;

@Mapper(uses= {TechAudioRequirementsMapper.class})
public interface MaterialAudioRequirementsMapper {
	
	MaterialAudioRequirementsMapper INSTANCE=Mappers.getMapper(MaterialAudioRequirementsMapper.class);
	
	MaterialAudioRequirementsDTO toMaterialAudioRequirementsDto(MaterialAudioRequirements materialAudioRequirementsDomain);
	
	@InheritInverseConfiguration
	MaterialAudioRequirements fromMaterialAudioRequirementsDto(MaterialAudioRequirementsDTO materialAudioRequirementsDto);
	

}
