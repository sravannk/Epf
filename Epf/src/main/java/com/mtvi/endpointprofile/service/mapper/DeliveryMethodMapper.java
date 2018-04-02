package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.DeliveryMethod;
import com.mtvi.endpointprofile.service.dto.DeliveryMethodDTO;

@Mapper
public interface DeliveryMethodMapper {
	
	DeliveryMethodMapper INSTANCE=Mappers.getMapper(DeliveryMethodMapper.class);
	
	
	DeliveryMethodDTO toDeliveryMethodDto(DeliveryMethod deliveryMethodDomain);
	
	@InheritInverseConfiguration
	DeliveryMethod fromDeliveryMethodDto(DeliveryMethodDTO deliveryMethodDto);
	
	

}
