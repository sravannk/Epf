package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.TechAudioRequirements;
import com.mtvi.endpointprofile.service.dto.TechAudioRequirementsDTO;

@Mapper
public interface TechAudioRequirementsMapper {

	TechAudioRequirementsMapper INSTANCE = Mappers.getMapper(TechAudioRequirementsMapper.class);
	
	TechAudioRequirementsDTO toTechAudioDto(TechAudioRequirements techAudioDomain);
	
	@InheritInverseConfiguration
	TechAudioRequirements fromTechAudioDto(TechAudioRequirementsDTO techAudioDto);
	

}
