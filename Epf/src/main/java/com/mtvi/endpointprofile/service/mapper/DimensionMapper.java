package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.Dimension;
import com.mtvi.endpointprofile.service.dto.DimensionDTO;

@Mapper
public interface DimensionMapper {
	
	DimensionMapper INSTANCE=Mappers.getMapper(DimensionMapper.class);
	
	DimensionDTO toDimensionDto(Dimension dimensionDomain);
	
	@InheritInverseConfiguration
	Dimension fromDimensionDto(DimensionDTO dimensionDto);
	

}
