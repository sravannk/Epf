package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.MaterialCaptionRequirements;
import com.mtvi.endpointprofile.service.dto.MaterialCaptionRequirementsDTO;

@Mapper(uses = { CaptionRequirementsMapper.class, MaterialMapper.class })
public interface MaterialCaptionRequirementsMapper {

	MaterialCaptionRequirementsMapper INSTANCE = Mappers.getMapper(MaterialCaptionRequirementsMapper.class);

	MaterialCaptionRequirementsDTO toMatCaptionRequirementsDTO(
			MaterialCaptionRequirements matCaptionRequirementsDomain);

	@InheritInverseConfiguration
	MaterialCaptionRequirements fromMatCaptionRequirementsDTO(MaterialCaptionRequirementsDTO matCaptionRequirementsDto);

}
