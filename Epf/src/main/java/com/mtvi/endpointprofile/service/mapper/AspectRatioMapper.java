package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.AspectRatio;
import com.mtvi.endpointprofile.service.dto.AspectRatioDTO;

@Mapper
public interface AspectRatioMapper {

	AspectRatioMapper INSTANCE = Mappers.getMapper(AspectRatioMapper.class);

	AspectRatioDTO toAspectRatioDTO(AspectRatio aspectRatioDomain);
	
	@InheritInverseConfiguration
	AspectRatio fromAspectRatioDTO(AspectRatioDTO aspectRatioDto);
}
