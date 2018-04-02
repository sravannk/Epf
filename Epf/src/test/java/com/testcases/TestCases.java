package com.testcases;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.Test;

import com.mtvi.endpointprofile.domain.AspectRatio;
import com.mtvi.endpointprofile.domain.CaptionRequirements;
import com.mtvi.endpointprofile.domain.Channel;
import com.mtvi.endpointprofile.domain.Codec;
import com.mtvi.endpointprofile.domain.ContentDescriptor;
import com.mtvi.endpointprofile.domain.ContentLevel;
import com.mtvi.endpointprofile.service.dto.AspectRatioDTO;
import com.mtvi.endpointprofile.service.dto.CaptionRequirementsDTO;
import com.mtvi.endpointprofile.service.dto.ChannelDTO;
import com.mtvi.endpointprofile.service.dto.CodecDTO;
import com.mtvi.endpointprofile.service.dto.ContentDescriptorDTO;
import com.mtvi.endpointprofile.service.dto.ContentLevelDTO;
import com.mtvi.endpointprofile.service.dto.DeliveryContextDTO;
import com.mtvi.endpointprofile.service.mapper.AspectRatioMapper;
import com.mtvi.endpointprofile.service.mapper.CaptionRequirementsMapper;
import com.mtvi.endpointprofile.service.mapper.ChannelMapper;
import com.mtvi.endpointprofile.service.mapper.CodecMapper;
import com.mtvi.endpointprofile.service.mapper.ContentDescriptorMapper;
import com.mtvi.endpointprofile.service.mapper.ContentLevelMapper;

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

	/*@Test
	public void toDeliveryContextDtotoEntity() {
		DeliveryContextDTO deliveryContextDto = new DeliveryContextDTO();
		Channel channel = new Channel();channel.setName("Channel Name");

		deliveryContextDto.setChannel(Collections.singleton(channel));
	}*/
}
