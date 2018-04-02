package com.mtvi.endpointprofile.service.dto;


public class DeliveryContextRequestDTO {
    
    private String endpoint;
    private String channel;
    private String entityType;
    private String platform;
    
    public String getEndpoint() {
        return endpoint;
    }
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    public String getChannel() {
        return channel;
    }
    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getEntityType() {
        return entityType;
    }
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    @Override
    public String toString() {
        return "DeliveryContextRequestDTO [endpoint=" + endpoint + ", channel=" + channel + ", entityType=" + entityType
                + ", platform=" + platform + "]";
    }
}
