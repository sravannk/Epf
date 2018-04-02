package com.testcases;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.mtvi.endpointprofile.domain.AspectRatio;
import com.mtvi.endpointprofile.domain.CaptionRequirements;
import com.mtvi.endpointprofile.domain.Channel;
import com.mtvi.endpointprofile.domain.Codec;
import com.mtvi.endpointprofile.domain.ContentDescriptor;
import com.mtvi.endpointprofile.domain.ContentLevel;
import com.mtvi.endpointprofile.domain.DeliveryContextMaterials;
import com.mtvi.endpointprofile.domain.DeliveryMethod;
import com.mtvi.endpointprofile.domain.Dimension;
import com.mtvi.endpointprofile.domain.EncodingFormat;
import com.mtvi.endpointprofile.domain.Material;
import com.mtvi.endpointprofile.domain.PackageStructure;
import com.mtvi.endpointprofile.service.dto.AspectRatioDTO;
import com.mtvi.endpointprofile.service.dto.CaptionRequirementsDTO;
import com.mtvi.endpointprofile.service.dto.ChannelDTO;
import com.mtvi.endpointprofile.service.dto.CodecDTO;
import com.mtvi.endpointprofile.service.dto.ContentDescriptorDTO;
import com.mtvi.endpointprofile.service.dto.ContentLevelDTO;
import com.mtvi.endpointprofile.service.dto.DeliveryContextMaterialsDTO;
import com.mtvi.endpointprofile.service.dto.DeliveryMethodDTO;
import com.mtvi.endpointprofile.service.dto.DimensionDTO;
import com.mtvi.endpointprofile.service.dto.EncodingFormatDTO;
import com.mtvi.endpointprofile.service.mapper.AspectRatioMapper;
import com.mtvi.endpointprofile.service.mapper.CaptionRequirementsMapper;
import com.mtvi.endpointprofile.service.mapper.ChannelMapper;
import com.mtvi.endpointprofile.service.mapper.CodecMapper;
import com.mtvi.endpointprofile.service.mapper.ContentDescriptorMapper;
import com.mtvi.endpointprofile.service.mapper.ContentLevelMapper;
import com.mtvi.endpointprofile.service.mapper.DeliveryContextMaterialsMapper;
import com.mtvi.endpointprofile.service.mapper.DeliveryMethodMapper;
import com.mtvi.endpointprofile.service.mapper.DimensionMapper;
import com.mtvi.endpointprofile.service.mapper.EncodingFormatMapper;

public class TestCases {

	@Test
	public void testAspectRatioDtoToEntity() {

		AspectRatioDTO aspectRatio = new AspectRatioDTO();
		aspectRatio.setId(1l);
		aspectRatio.setName("AspectRatio Data");

		AspectRatio toAspectRatio = AspectRatioMapper.INSTANCE.fromAspectRatioDTO(aspectRatio);
		assertThat(toAspectRatio.getId()).isEqualTo(1l);
		assertThat(toAspectRatio.getName()).isEqualTo("AspectRatio Data");

	}

	@Test
	public void testAspectRatioEntityToDto() {

		AspectRatio aspectRatio = new AspectRatio();
		aspectRatio.setId(1l);
		aspectRatio.setName("AspectRatio Data");

		AspectRatioDTO toAspectRatio = AspectRatioMapper.INSTANCE.toAspectRatioDTO(aspectRatio);
		assertThat(toAspectRatio.getId()).isEqualTo(1l);
		assertThat(toAspectRatio.getName()).isEqualTo("AspectRatio Data");

	}

	@Test
	public void testCaptionRequirementsDtotoEntity() {
		CaptionRequirementsDTO captionRequirementsDto = new CaptionRequirementsDTO();
		captionRequirementsDto.setId(2l);
		captionRequirementsDto.setName("CaptionRequirement Data");

		CaptionRequirements captionRequirementEntity = CaptionRequirementsMapper.INSTANCE
				.fromCaptionRequirementDTO(captionRequirementsDto);
		assertThat(captionRequirementEntity.getId()).isEqualTo(2l);
		assertThat(captionRequirementEntity.getName()).isEqualTo("CaptionRequirement Data");

	}

	@Test
	public void testCaptionRequirementsEntitytoDto() {
		CaptionRequirements captionRequirements = new CaptionRequirements();
		captionRequirements.setId(2l);
		captionRequirements.setName("CaptionRequirement Data");

		CaptionRequirementsDTO captionRequirementDto = CaptionRequirementsMapper.INSTANCE
				.toCaptionRequirementDTO(captionRequirements);
		assertThat(captionRequirementDto.getId()).isEqualTo(2l);
		assertThat(captionRequirementDto.getName()).isEqualTo("CaptionRequirement Data");

	}

	@Test
	public void testChannelDtotoEntity() {
		ChannelDTO channelDto = new ChannelDTO();
		channelDto.setId(3l);
		channelDto.setName("Channel Name");
		channelDto.setShortName("CN");
		channelDto.setStatus(5);

		Channel channel = ChannelMapper.INSTANCE.fromChannelDTO(channelDto);
		assertThat(channel.getId()).isEqualTo(2l);
		assertThat(channel.getName()).isEqualTo("Channel Name");
		assertThat(channel.getShortName()).isEqualTo("CN");
		assertThat(channel.getStatus()).isEqualTo(5);

	}

	@Test
	public void testChannelEntitytoDto() {
		Channel channel = new Channel();
		channel.setId(3l);
		channel.setName("Channel Name");
		channel.setShortName("CN");
		channel.setStatus(5);

		ChannelDTO channelDto = ChannelMapper.INSTANCE.toChannelDTO(channel);
		assertThat(channelDto.getId()).isEqualTo(2l);
		assertThat(channelDto.getName()).isEqualTo("Channel Name");
		assertThat(channelDto.getShortName()).isEqualTo("CN");
		assertThat(channelDto.getStatus()).isEqualTo(5);

	}

	@Test
	public void testCodecEntitytoDto() {
		Codec codec = new Codec();
		codec.setId(4l);
		codec.setName("Codec Data");

		CodecDTO codecDto = CodecMapper.INSTANCE.toCodecDTO(codec);
		assertThat(codecDto.getId()).isEqualTo(4l);
		assertThat(codecDto.getName()).isEqualTo("Codec Data");

	}

	@Test
	public void fromCodecDtotoEntity() {
		CodecDTO codecDto = new CodecDTO();
		codecDto.setId(4l);
		codecDto.setName("Codec Data");

		Codec codec = CodecMapper.INSTANCE.fromCodecDTO(codecDto);
		assertThat(codec.getId()).isEqualTo(4l);
		assertThat(codec.getName()).isEqualTo("Codec Data");

	}

	@Test
	public void toContentDescriptorEntitytoDto() {
		ContentDescriptor contentDescriptor = new ContentDescriptor();
		contentDescriptor.setId(5l);
		contentDescriptor.setName("Content Description");
		contentDescriptor.setDescribesVersion(true);

		ContentDescriptorDTO contentDescriptorDto = ContentDescriptorMapper.INSTANCE
				.toContentDesriptorDTO(contentDescriptor);
		assertThat(contentDescriptorDto.getId()).isEqualTo(5l);
		assertThat(contentDescriptorDto.getName()).isEqualTo("Content Description");
		assertThat(contentDescriptorDto.getDescribesVersion()).isTrue();

	}

	@Test
	public void fromContentDescriptorDtotoEntity() {
		ContentDescriptorDTO contentDescriptorDto = new ContentDescriptorDTO();
		contentDescriptorDto.setId(5l);
		contentDescriptorDto.setName("Content Description");
		contentDescriptorDto.setDescribesVersion(true);

		ContentDescriptor contentDescriptor = ContentDescriptorMapper.INSTANCE
				.fromContentDesriptorDTO(contentDescriptorDto);
		assertThat(contentDescriptor.getId()).isEqualTo(5l);
		assertThat(contentDescriptor.getName()).isEqualTo("Content Description");
		assertThat(contentDescriptor.isDescribesVersion()).isTrue();

	}

	@Test
	public void toContentLevelDtotoEntity() {
		ContentLevelDTO contentLevelDto = new ContentLevelDTO();
		contentLevelDto.setId(6l);
		contentLevelDto.setName("Content Data");

		ContentLevel contentLevel = ContentLevelMapper.INSTANCE.fromContentLevelDTO(contentLevelDto);
		assertThat(contentLevel.getId()).isEqualTo(6l);
		assertThat(contentLevel.getName()).isEqualTo("Content Data");

	}

	@Test
	public void fromContentLevelEntitytoDto() {
		ContentLevel contentLevel = new ContentLevel();
		contentLevel.setId(7l);
		contentLevel.setName("Content Data");

		ContentLevelDTO contentLevelDto = ContentLevelMapper.INSTANCE.toContentLevelDTO(contentLevel);
		assertThat(contentLevelDto.getId()).isEqualTo(7l);
		assertThat(contentLevelDto.getName()).isEqualTo("Content Data");

	}

	@Test
	public void toDeliveryContextMaterialDto() {
		DeliveryContextMaterials deliveryContextMaterials = new DeliveryContextMaterials();
		deliveryContextMaterials.setId(12l);
		deliveryContextMaterials.setName("TV");
		deliveryContextMaterials.setDestinationTemplate("Template");
		PackageStructure packageStructure = new PackageStructure();
		packageStructure.setName("PS");

		deliveryContextMaterials.setPackageStructure(packageStructure);

		Material mat = new Material();
		mat.setName("Image download");
		deliveryContextMaterials.setMaterial(mat);
		DeliveryMethod context=new DeliveryMethod();
		context.setName("PAckage");
		deliveryContextMaterials.setDeliveryMethod(context);
		
		
		DeliveryContextMaterialsDTO deliveryCMaterial=DeliveryContextMaterialsMapper.INSTANCE.toDeliveryContextMaterialsDTO(deliveryContextMaterials);
		
		assertThat(deliveryCMaterial.getId()).isEqualTo(12l);
		assertThat(deliveryCMaterial.getName()).isEqualTo("TV");
		assertThat(deliveryCMaterial.getDestinationTemplate()).isEqualTo("Template");
		assertThat(deliveryCMaterial.getPackageStructure()).isEqualTo(packageStructure);
		assertThat(deliveryCMaterial.getMaterial()).isEqualTo(mat);
		assertThat(deliveryCMaterial.getDeliveryMethod()).isEqualTo(context);
		
		

	}

	@Test
	public void fromDeliveryContextMaterialDto() {
		DeliveryContextMaterialsDTO deliveryContextMaterials = new DeliveryContextMaterialsDTO();
		deliveryContextMaterials.setId(12l);
		deliveryContextMaterials.setName("TV");
		deliveryContextMaterials.setDestinationTemplate("Template");
		PackageStructure packageStructure = new PackageStructure();
		packageStructure.setName("PS");

		deliveryContextMaterials.setPackageStructure(packageStructure);

		Material mat = new Material();
		mat.setName("Image download");
		deliveryContextMaterials.setMaterial(mat);
		DeliveryMethod context=new DeliveryMethod();
		context.setName("PAckage");
		deliveryContextMaterials.setDeliveryMethod(context);
		
		
		DeliveryContextMaterials deliveryCMaterial=DeliveryContextMaterialsMapper.INSTANCE.fromDeliveryContextMaterialsDTO(deliveryContextMaterials);
		
		assertThat(deliveryCMaterial.getId()).isEqualTo(12l);
		assertThat(deliveryCMaterial.getName()).isEqualTo("TV");
		assertThat(deliveryCMaterial.getDestinationTemplate()).isEqualTo("Template");
		assertThat(deliveryCMaterial.getPackageStructure()).isEqualTo(packageStructure);
		assertThat(deliveryCMaterial.getMaterial()).isEqualTo(mat);
		assertThat(deliveryCMaterial.getDeliveryMethod()).isEqualTo(context);
	}

	@Test
	public void fromDeliveryMethodDto() {
		DeliveryMethodDTO deliveryMethodDto = new DeliveryMethodDTO();
		deliveryMethodDto.setId(12l);
		deliveryMethodDto.setName("Pack");

		DeliveryMethod deliveryMethod = DeliveryMethodMapper.INSTANCE.fromDeliveryMethodDto(deliveryMethodDto);
		assertThat(deliveryMethod.getId()).isEqualTo(12l);
		assertThat(deliveryMethod.getName()).isEqualTo("Pack");

	}

	@Test
	public void toDeliveryMethodDto() {
		DeliveryMethod deliveryMethod = new DeliveryMethod();
		deliveryMethod.setId(12l);
		deliveryMethod.setName("Pack");

		DeliveryMethodDTO deliveryMethodDto = DeliveryMethodMapper.INSTANCE.toDeliveryMethodDto(deliveryMethod);
		assertThat(deliveryMethodDto.getId()).isEqualTo(12l);
		assertThat(deliveryMethodDto.getName()).isEqualTo("Pack");

	}

	@Test
	public void fromDimensionDto() {
		DimensionDTO dimensionDto = new DimensionDTO();
		dimensionDto.setId(123l);
		dimensionDto.setName("TV");
		dimensionDto.setWidth(15);
		dimensionDto.setHeight(15);

		Dimension dimension = DimensionMapper.INSTANCE.fromDimensionDto(dimensionDto);
		assertThat(dimension.getId()).isEqualTo(12l);
		assertThat(dimension.getName()).isEqualTo("TV");
		assertThat(dimension.getWidth()).isEqualTo(15);
		assertThat(dimension.getHeight()).isEqualTo(15);

	}

	@Test
	public void toDimensionDto() {

		Dimension dimension = new Dimension();
		dimension.setId(123l);
		dimension.setName("TV");
		dimension.setWidth(15);
		dimension.setHeight(15);

		DimensionDTO dimensionDto = DimensionMapper.INSTANCE.toDimensionDto(dimension);
		assertThat(dimensionDto.getId()).isEqualTo(12l);
		assertThat(dimensionDto.getName()).isEqualTo("TV");
		assertThat(dimensionDto.getWidth()).isEqualTo(15);
		assertThat(dimensionDto.getHeight()).isEqualTo(15);

	}

	@Test
	public void fromEncodingFormatDto() {
		EncodingFormatDTO encodingFormatDTO = new EncodingFormatDTO();

		encodingFormatDTO.setId(1l);
		encodingFormatDTO.setName("XSFA1204");

		EncodingFormat encodingFormat = EncodingFormatMapper.INSTANCE.fromEncodingFormatDto(encodingFormatDTO);

		assertThat(encodingFormat.getId()).isEqualTo(12l);
		assertThat(encodingFormat.getName()).isEqualTo("XSFA1204");
	}

	@Test
	public void toEncodingFormatDto() {
		EncodingFormat encodingFormat = new EncodingFormat();

		encodingFormat.setId(1l);
		encodingFormat.setName("XSFA1204");

		EncodingFormatDTO encodingFormatDto = EncodingFormatMapper.INSTANCE.toEncodingFormatDto(encodingFormat);

		assertThat(encodingFormatDto.getId()).isEqualTo(12l);
		assertThat(encodingFormatDto.getName()).isEqualTo("XSFA1204");
	}

}
