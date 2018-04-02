package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.TechVideoRequirements;
import com.mtvi.endpointprofile.service.dto.TechVideoRequirementsDTO;

@Mapper
public interface TechVideoRequirementsMapper {
	
	TechVideoRequirementsMapper INSTANCE=Mappers.getMapper(TechVideoRequirementsMapper.class);
	
	@Mappings({
	    @Mapping(target = "encodingFormat", source = "encodingFormat.name")
	  	  
	})
	TechVideoRequirementsDTO toTechVideoRequirementDTO(TechVideoRequirements  techVideoRequirementsDomainDomain);
	
	@InheritInverseConfiguration
	TechVideoRequirements fromTechVideoRequirementDTO(TechVideoRequirementsDTO  techVideoRequirementsDto);
	
	

}
