package com.mtvi.endpointprofile.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.mtvi.endpointprofile.domain.DeliveryContext;
import com.mtvi.endpointprofile.service.dto.DeliveryContextDTO;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeliveryContextMapper {
	
	DeliveryContextMapper INSTANCE=Mappers.getMapper(DeliveryContextMapper.class);
	
	@Mappings({
        @Mapping(source = "entityType.name", target = "entityType"),
        @Mapping(source = "endPoint.name", target = "endpoint"),
        @Mapping(source = "channel.name", target = "channel"),
        @Mapping(source = "platform.name", target = "platform")
    })
	DeliveryContextDTO toDeliveryContextDto(DeliveryContext deliveryContextDomain);
	
	
	@InheritInverseConfiguration
	DeliveryContext fromDeliveryContextDto(DeliveryContextDTO deliveryContextDto);

}
