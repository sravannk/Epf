package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.EncodingFormat;
import com.mtvi.endpointprofile.service.dto.EncodingFormatDTO;

@Mapper
public interface EncodingFormatMapper {

	EncodingFormatMapper INSTANCE=Mappers.getMapper(EncodingFormatMapper.class);
	
	EncodingFormatDTO toEncodingFormatDto(EncodingFormat encodingFormatDomain);
	
	@InheritInverseConfiguration
	EncodingFormat fromEncodingFormatDto(EncodingFormatDTO encodingFormatDto);
	
}
