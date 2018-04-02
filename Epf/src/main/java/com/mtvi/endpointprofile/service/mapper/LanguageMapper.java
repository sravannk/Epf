package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.Language;
import com.mtvi.endpointprofile.service.dto.LanguageDTO;

@Mapper
public interface LanguageMapper {
	
	LanguageMapper INSTANCE = Mappers.getMapper( LanguageMapper.class );
	
	LanguageDTO toLanguageDTO(Language languageDomain);
	
	@InheritInverseConfiguration
	Language  fromLanguageDTO(LanguageDTO languegeDto);
	
}
