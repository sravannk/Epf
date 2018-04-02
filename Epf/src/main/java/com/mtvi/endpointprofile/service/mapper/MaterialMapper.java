package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.Material;
import com.mtvi.endpointprofile.service.dto.MaterialDTO;

@Mapper(uses= {MaterialTypeMapper.class,LanguageMapper.class,ContentLevelMapper.class,ContentDescriptorMapper.class,TechnicalRequirementMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MaterialMapper {

	
	MaterialMapper INSTANCE=Mappers.getMapper(MaterialMapper.class);
	
	
	@Mappings({
		  @Mapping(source = "materialType.name", target = "type"),
		  @Mapping(source="contentLevel.name",target="contentLevel"),
		  @Mapping(source="contentDescriptor.name",target="contentDescriptor")
		})
	MaterialDTO toMaterialDTO(Material materailDomain);
	
	@InheritInverseConfiguration
	@Mappings({
		  @Mapping(target = "materialType.name", source = "type"),
		  @Mapping(target="contentLevel.name",source="contentLevel"),
		  @Mapping(target="contentDescriptor.name",source="contentDescriptor")
		})
	Material fromMaterialDTO(MaterialDTO materailDto);
	
	
	
}
