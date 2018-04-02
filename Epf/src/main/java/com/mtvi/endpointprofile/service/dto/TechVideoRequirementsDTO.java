package com.mtvi.endpointprofile.service.dto;

import com.mtvi.endpointprofile.domain.AspectRatio;
import com.mtvi.endpointprofile.domain.Codec;
import com.mtvi.endpointprofile.domain.Dimension;
import com.mtvi.endpointprofile.domain.EncodingFormat;
import com.mtvi.endpointprofile.domain.ScanType;
import com.mtvi.endpointprofile.domain.Specification;

public class TechVideoRequirementsDTO {

	private Long id;

	private String name;

	private String frameRate;
	private Double videoAvgBitRate;

	private String description;
	private Integer audioSampleRate;

	private Integer audioBitDepth;

	private String audioChannels;

	private String audioChannelConfiguration;

	private Integer xPpi;

	private Integer yPpi;

	private String audioTrackConfiguration;

	private Integer timeCodeStartTime;

	private String timeCodeType;

	private Boolean captionEmbedded;

	private Dimension dimension;

	private String encodingFormat;

	private AspectRatio storageAspectRatio;

	private AspectRatio displayAspectRatio;

	private Codec videoCodec;

	private ScanType scanType;

	private Codec audioCodec;

	private Specification specification;

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

	public String getFrameRate() {
		return frameRate;
	}

	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}

	

	public Double getVideoAvgBitRate() {
		return videoAvgBitRate;
	}

	public void setVideoAvgBitRate(Double videoAvgBitRate) {
		this.videoAvgBitRate = videoAvgBitRate;
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

	public String getAudioChannels() {
		return audioChannels;
	}

	public void setAudioChannels(String audioChannels) {
		this.audioChannels = audioChannels;
	}

	public String getAudioChannelConfiguration() {
		return audioChannelConfiguration;
	}

	public void setAudioChannelConfiguration(String audioChannelConfiguration) {
		this.audioChannelConfiguration = audioChannelConfiguration;
	}

	public Integer getxPpi() {
		return xPpi;
	}

	public void setxPpi(Integer xPpi) {
		this.xPpi = xPpi;
	}

	public Integer getyPpi() {
		return yPpi;
	}

	public void setyPpi(Integer yPpi) {
		this.yPpi = yPpi;
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

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public AspectRatio getStorageAspectRatio() {
		return storageAspectRatio;
	}

	public void setStorageAspectRatio(AspectRatio storageAspectRatio) {
		this.storageAspectRatio = storageAspectRatio;
	}

	public AspectRatio getDisplayAspectRatio() {
		return displayAspectRatio;
	}

	public void setDisplayAspectRatio(AspectRatio displayAspectRatio) {
		this.displayAspectRatio = displayAspectRatio;
	}

	public Codec getVideoCodec() {
		return videoCodec;
	}

	public void setVideoCodec(Codec videoCodec) {
		this.videoCodec = videoCodec;
	}

	public ScanType getScanType() {
		return scanType;
	}

	public void setScanType(ScanType scanType) {
		this.scanType = scanType;
	}

	public Codec getAudioCodec() {
		return audioCodec;
	}

	public void setAudioCodec(Codec audioCodec) {
		this.audioCodec = audioCodec;
	}

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

}
