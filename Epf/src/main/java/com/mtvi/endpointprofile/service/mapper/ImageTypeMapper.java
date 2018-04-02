package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.ImageType;
import com.mtvi.endpointprofile.service.dto.ImageTypeDTO;

@Mapper
public interface ImageTypeMapper {

	ImageTypeMapper INSTNACE = Mappers.getMapper(ImageTypeMapper.class);

	ImageTypeDTO toImageTypeDto(ImageType imageTypeDomain);

	@InheritInverseConfiguration
	ImageType fromImageTypeDto(ImageTypeDTO imageTypeDto);

}
