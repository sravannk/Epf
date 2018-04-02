package com.mtvi.endpointprofile.service.dto;

import com.mtvi.endpointprofile.domain.Codec;
import com.mtvi.endpointprofile.domain.EncodingFormat;

public class TechAudioRequirementsDTO {

	private Long id;

	private String name;

	private String description;

	private Integer audioSampleRate;

	private Integer audioBitDepth;

	private Integer audioChannels;

	private String audioChannelConfiguration;

	private String audioTrackConfiguration;

	private Integer timeCodeStartTime;

	private String timeCodeType;

	private Boolean captionEmbedded;

	private Codec audioCodec;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAudioSampleRate() {
		return audioSampleRate;
	}

	public void setAudioSampleRate(Integer audioSampleRate) {
		this.audioSampleRate = audioSampleRate;
	}

	public Integer getAudioBitDepth() {
		return audioBitDepth;
	}

	public void setAudioBitDepth(Integer audioBitDepth) {
		this.audioBitDepth = audioBitDepth;
	}

	public Integer getAudioChannels() {
		return audioChannels;
	}

	public void setAudioChannels(Integer audioChannels) {
		this.audioChannels = audioChannels;
	}

	public String getAudioChannelConfiguration() {
		return audioChannelConfiguration;
	}

	public void setAudioChannelConfiguration(String audioChannelConfiguration) {
		this.audioChannelConfiguration = audioChannelConfiguration;
	}

	public String getAudioTrackConfiguration() {
		return audioTrackConfiguration;
	}

	public void setAudioTrackConfiguration(String audioTrackConfiguration) {
		this.audioTrackConfiguration = audioTrackConfiguration;
	}

	public Integer getTimeCodeStartTime() {
		return timeCodeStartTime;
	}

	public void setTimeCodeStartTime(Integer timeCodeStartTime) {
		this.timeCodeStartTime = timeCodeStartTime;
	}

	public String getTimeCodeType() {
		return timeCodeType;
	}

	public void setTimeCodeType(String timeCodeType) {
		this.timeCodeType = timeCodeType;
	}

	public Boolean getCaptionEmbedded() {
		return captionEmbedded;
	}

	public void setCaptionEmbedded(Boolean captionEmbedded) {
		this.captionEmbedded = captionEmbedded;
	}

	public Codec getAudioCodec() {
		return audioCodec;
	}

	public void setAudioCodec(Codec audioCodec) {
		this.audioCodec = audioCodec;
	}

	public EncodingFormat getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(EncodingFormat encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	private EncodingFormat encodingFormat;

}
