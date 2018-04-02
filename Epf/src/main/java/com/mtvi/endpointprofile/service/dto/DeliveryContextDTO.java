package com.mtvi.endpointprofile.service.dto;

import java.util.List;
import java.util.Set;

import com.mtvi.endpointprofile.domain.Channel;



public class DeliveryContextDTO {
    
    private String endpoint;
    private Set<Channel> channel;
    private String entityType;
    private String platform;
    
    private List<PackageStructureDTO> packageStructures;
    
    
    public String getEndpoint() {
        return endpoint;
    }
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    public Set<Channel> getChannel() {
        return channel;
    }
    public void setChannel(Set<Channel> set) {
        this.channel = set;
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
        return "DeliveryContextDTO [endpoint=" + endpoint + ", channel=" + channel + ", entityType=" + entityType
                + ", platform=" + platform + ", packageStructures=" + packageStructures + "]";
    }
    public List<PackageStructureDTO> getPackageStructures() {
        return packageStructures;
    }
    public void setPackageStructures(List<PackageStructureDTO> packageStructures) {
        this.packageStructures = packageStructures;
    }

}
