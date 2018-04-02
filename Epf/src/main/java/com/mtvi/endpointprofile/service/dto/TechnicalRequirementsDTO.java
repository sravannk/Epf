package com.mtvi.endpointprofile.service.dto;

public  class TechnicalRequirementsDTO {
    
    private String templateName;
    private String codec;
    private String frameRate;
    private String audioCodec;
    private String audioChannels;
    private Boolean captionEmbedded;
    private Boolean checksumRequired;
    private String encodingFormat;
    private String displayAspectRatio;
    private String storageAspectRatio;
    
    private String bitrate;
    
    private String scanType;
    
    
    private Integer width;
    private Integer height;
    
    @Override
    public String toString() {
        return "TechnicalRequirementsDTO [templateName=" + templateName + ", codec=" + codec + ", frameRate="
                + frameRate + ", audioCodec=" + audioCodec + ", audioChannels=" + audioChannels + ", captionEmbedded="
                + captionEmbedded + ", checksumRequired=" + checksumRequired + ", encodingFormat=" + encodingFormat
                + ", displayAspectRatio=" + displayAspectRatio + ", storageAspectRatio=" + storageAspectRatio
                + ", bitrate=" + bitrate + ", scanType=" + scanType + ", width=" + width + ", height=" + height + "]";
    }
    public String getTemplateName() {
        return templateName;
    }
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    public String getCodec() {
        return codec;
    }
    public void setCodec(String codec) {
        this.codec = codec;
    }
    public String getFrameRate() {
        return frameRate;
    }
    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }
    public String getAudioCodec() {
        return audioCodec;
    }
    public void setAudioCodec(String string) {
        this.audioCodec = string;
    }
    public String getAudioChannels() {
        return audioChannels;
    }
    public void setAudioChannels(String audioChannels) {
        this.audioChannels = audioChannels;
    }
    
    public Boolean getCaptionEmbedded() {
        return captionEmbedded;
    }
    public void setCaptionEmbedded(Boolean captionEmbedded) {
        this.captionEmbedded = captionEmbedded;
    }
    public Boolean getChecksumRequired() {
        return checksumRequired;
    }
    public void setChecksumRequired(Boolean checksumRequired) {
        this.checksumRequired = checksumRequired;
    }
    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public String getEncodingFormat() {
        return encodingFormat;
    }
    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }
    public String getDisplayAspectRatio() {
        return displayAspectRatio;
    }
    public void setDisplayAspectRatio(String displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
    }
    public String getStorageAspectRatio() {
        return storageAspectRatio;
    }
    public void setStorageAspectRatio(String storageAspectRatio) {
        this.storageAspectRatio = storageAspectRatio;
    }
    public String getBitrate() {
        return bitrate;
    }
    public void setBitrate(String bitrate) {
        this.bitrate = bitrate;
    }
    public String getScanType() {
        return scanType;
    }
    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

}
