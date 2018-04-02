package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.PackageStructure;
import com.mtvi.endpointprofile.service.dto.PackageStructureDTO;

@Mapper(uses= {MaterialMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PackageStructureMapper {

	/*PackageStructureMapper INSTANCE=Mappers.getMapper(PackageStructureMapper.class);
	@Mappings({
		  @Mapping(source = "deliveryTemplate", target = "materials.destinationTemplate"),
		  @Mapping(source="packageTemplate",target="")
		 // @Mapping(source="",target="")
		})
	PackageStructureDTO toPackageStructureDto(PackageStructure packageStrucureDomain);
	
	@InheritInverseConfiguration
	PackageStructure fromPackageStructureDto(PackageStructureDTO packageStrucureDto);*/
	
}
