package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.MaterialImageRequirements;
import com.mtvi.endpointprofile.service.dto.MaterialImageRequirementsDTO;

@Mapper
public interface MaterialImageRequirementsMapper {

	MaterialImageRequirementsMapper INSTANCE=Mappers.getMapper(MaterialImageRequirementsMapper.class);
	
	MaterialImageRequirementsDTO toMatImageRequirementsDto(MaterialImageRequirements matImageRequirementsDomain);
	
	@InheritInverseConfiguration
	MaterialImageRequirements fromMatImageRequirementsDto(MaterialImageRequirementsDTO matImageRequirementsDts);
	
}
