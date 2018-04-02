package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.Platform;
import com.mtvi.endpointprofile.service.dto.PlatformDTO;

@Mapper
public interface PlatformMapper {

	PlatformMapper INSTANCE = Mappers.getMapper(PlatformMapper.class);

	PlatformDTO toPlatformDTO(Platform platformDomain);

	@InheritInverseConfiguration
	Platform fromPlatformDTO(PlatformDTO platformDto);

}
