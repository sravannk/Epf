package com.mtvi.endpointprofile.service.dto;

import java.util.List;



public class MaterialDTO {
    
    private String type;
    private String contentLevel;
    private String contentDescriptor;
    private Boolean checksumRequired;
    private String templateName;
    

    private String fileNameTemplate;
    private String fileName;
    private String folderNameTemplate;
    private String folderName;
    private String destinationFolder;
    private String destinationTemplate;
    
    List<TechnicalRequirementsDTO> technicalRequirements;
    @Override
    public String toString() {
        return "MaterialDTO [type=" + type + ", contentLevel=" + contentLevel + ", contentDescriptor="
                + contentDescriptor + ", checksumRequired=" + checksumRequired + ", templateName=" + templateName
                + ", fileNameTemplate=" + fileNameTemplate + ", fileName=" + fileName + ", folderNameTemplate="
                + folderNameTemplate + ", folderName=" + folderName + ", destinationFolder=" + destinationFolder
                + ", destinationTemplate=" + destinationTemplate + ", technicalRequirements=" + technicalRequirements
                + "]";
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getContentLevel() {
        return contentLevel;
    }
    public void setContentLevel(String contentLevel) {
        this.contentLevel = contentLevel;
    }
    public String getContentDescriptor() {
        return contentDescriptor;
    }
    public void setContentDescriptor(String contentDescriptor) {
        this.contentDescriptor = contentDescriptor;
    }
    public List<TechnicalRequirementsDTO> getTechnicalRequirements() {
        return technicalRequirements;
    }
    public void setTechnicalRequirements(List<TechnicalRequirementsDTO> technicalRequirements) {
        this.technicalRequirements = technicalRequirements;
    }
    

    public String getFileNameTemplate() {
        return fileNameTemplate;
    }
    public void setFileNameTemplate(String fileNameTemplate) {
        this.fileNameTemplate = fileNameTemplate;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFolderNameTemplate() {
        return folderNameTemplate;
    }
    public void setFolderNameTemplate(String folderNameTemplate) {
        this.folderNameTemplate = folderNameTemplate;
    }
    public String getFolderName() {
        return folderName;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    
    public String getDestinationFolder() {
        return destinationFolder;
    }
    public void setDestinationFolder(String destinationFolder) {
        this.destinationFolder = destinationFolder;
    }
    public String getDestinationTemplate() {
        return destinationTemplate;
    }
    public void setDestinationTemplate(String destinationTemplate) {
        this.destinationTemplate = destinationTemplate;
    }
    public Boolean getChecksumRequired() {
        return checksumRequired;
    }
    public void setChecksumRequired(Boolean checksumRequired) {
        this.checksumRequired = checksumRequired;
    }
    public String getTemplateName() {
        return templateName;
    }
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

}
