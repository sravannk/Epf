package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.Codec;
import com.mtvi.endpointprofile.service.dto.CodecDTO;

@Mapper
public interface CodecMapper {

	CodecMapper INSTANCE = Mappers.getMapper(CodecMapper.class);

	CodecDTO toCodecDTO(Codec codecDomain);

	@InheritInverseConfiguration
	Codec fromCodecDTO(CodecDTO codecDto);

}
