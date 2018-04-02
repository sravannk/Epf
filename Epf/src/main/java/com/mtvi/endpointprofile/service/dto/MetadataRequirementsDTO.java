package com.mtvi.endpointprofile.service.dto;

public class MetadataRequirementsDTO {

	private Long id;

	private String name;

	private String schema;

	private String schemaUrl;

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

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getSchemaUrl() {
		return schemaUrl;
	}

	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}
	
	

}
