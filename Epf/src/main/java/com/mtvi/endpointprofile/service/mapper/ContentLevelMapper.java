package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.ContentLevel;
import com.mtvi.endpointprofile.service.dto.ContentLevelDTO;

@Mapper
public interface ContentLevelMapper {
	
	ContentLevelMapper INSTANCE=Mappers.getMapper(ContentLevelMapper.class);
	
	ContentLevelDTO toContentLevelDTO(ContentLevel contentlevelDomain);
	
	@InheritInverseConfiguration
	ContentLevel  fromContentLevelDTO(ContentLevelDTO contentlevelDto);

}
