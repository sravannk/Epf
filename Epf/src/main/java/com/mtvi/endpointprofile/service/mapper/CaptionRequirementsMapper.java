package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.CaptionRequirements;
import com.mtvi.endpointprofile.service.dto.CaptionRequirementsDTO;

@Mapper
public interface CaptionRequirementsMapper {
	
	CaptionRequirementsMapper INSTANCE=Mappers.getMapper(CaptionRequirementsMapper.class);
	
	
	CaptionRequirementsDTO toCaptionRequirementDTO(CaptionRequirements captionRequirementsDomain);

	@InheritInverseConfiguration
	CaptionRequirements fromCaptionRequirementDTO(CaptionRequirementsDTO captionRequirementsDto);

}
