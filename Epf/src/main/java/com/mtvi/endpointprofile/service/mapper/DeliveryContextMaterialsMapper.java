package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.DeliveryContextMaterials;
import com.mtvi.endpointprofile.service.dto.DeliveryContextMaterialsDTO;

@Mapper
public interface DeliveryContextMaterialsMapper {
	
	DeliveryContextMaterialsMapper INSTANCE=Mappers.getMapper(DeliveryContextMaterialsMapper.class);
	
	DeliveryContextMaterialsDTO toDeliveryContextMaterialsDTO(DeliveryContextMaterials deliveryContextMaterialsDomain);
	
	@InheritInverseConfiguration
	DeliveryContextMaterials fromDeliveryContextMaterialsDTO(DeliveryContextMaterialsDTO deliveryContextMaterialsDto);

}
