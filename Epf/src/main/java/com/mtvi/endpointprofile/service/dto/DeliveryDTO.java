package com.mtvi.endpointprofile.service.dto;



public class DeliveryDTO {
    private String type;
    private String contentLevel;
    private String approvalTemplate;
    private String templateName;
    private String method;
    

    private String fileNameTemplate;
    private String fileName;
    private String folderNameTemplate;
    private String folderName;
    private String destinationFolder;
    private String destinationTemplate;
    private Integer orderOfDelivery;
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
    public String getApprovalTemplate() {
        return approvalTemplate;
    }
    public void setApprovalTemplate(String approvalTemplate) {
        this.approvalTemplate = approvalTemplate;
    }
    public String getTemplateName() {
        return templateName;
    }
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
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
    @Override
    public String toString() {
        return "DeliveryDTO [type=" + type + ", contentLevel=" + contentLevel + ", approvalTemplate=" + approvalTemplate
                + ", templateName=" + templateName + ", method=" + method + ", fileNameTemplate=" + fileNameTemplate
                + ", fileName=" + fileName + ", folderNameTemplate=" + folderNameTemplate + ", folderName=" + folderName
                + ", destinationFolder=" + destinationFolder + ", destinationTemplate=" + destinationTemplate
                + ", orderOfDelivery=" + orderOfDelivery + "]";
    }
    public Integer getOrderOfDelivery() {
        return orderOfDelivery;
    }
    public void setOrderOfDelivery(Integer orderOfDelivery) {
        this.orderOfDelivery = orderOfDelivery;
    }
    

}
