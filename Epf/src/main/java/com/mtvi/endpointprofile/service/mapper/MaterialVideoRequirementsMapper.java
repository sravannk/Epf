package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.MaterialVideoRequirements;
import com.mtvi.endpointprofile.service.dto.MaterialVideoRequirementsDTO;

@Mapper(uses = { MaterialMapper.class,TechVideoRequirementsMapper.class})
public interface MaterialVideoRequirementsMapper {

	
	MaterialVideoRequirementsMapper INSTANCE=Mappers.getMapper(MaterialVideoRequirementsMapper.class);
	
	
	MaterialVideoRequirementsDTO toMaterialVideoRequirementDto(MaterialVideoRequirements materialVideoRequirementDomain);
	
	@InheritInverseConfiguration
	MaterialVideoRequirements toMaterialVideoRequirementDto(MaterialVideoRequirementsDTO materialVideoRequirementDto);
	
	
}
