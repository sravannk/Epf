package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.TechImageRequirements;
import com.mtvi.endpointprofile.service.dto.TechImageRequirementsDTO;

@Mapper
public interface TechImageRequirementsMapper {
	
	TechImageRequirementsMapper INSTANCE=Mappers.getMapper(TechImageRequirementsMapper.class);
	
	
	TechImageRequirementsDTO toTechImageDto(TechImageRequirements techImageDomain);
	
	@InheritInverseConfiguration
	TechImageRequirements fromTechImageDto(TechImageRequirementsDTO techImageDto);
	

}
