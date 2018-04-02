package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.ContentDescriptor;
import com.mtvi.endpointprofile.service.dto.ContentDescriptorDTO;


@Mapper
public interface ContentDescriptorMapper {
	
	ContentDescriptorMapper INSTANCE=Mappers.getMapper(ContentDescriptorMapper.class);
	
	
	ContentDescriptorDTO toContentDesriptorDTO(ContentDescriptor contentdescriptorDomain);
	
	
	@InheritInverseConfiguration
	ContentDescriptor fromContentDesriptorDTO(ContentDescriptorDTO contentdescriptorDto);
}
