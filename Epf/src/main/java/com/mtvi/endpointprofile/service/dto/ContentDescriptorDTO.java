package com.mtvi.endpointprofile.service.dto;

import javax.persistence.Column;

public class ContentDescriptorDTO {

	private Long id;

	private String name;

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

	public Boolean getDescribesVersion() {
		return describesVersion;
	}

	public void setDescribesVersion(Boolean describesVersion) {
		this.describesVersion = describesVersion;
	}

	private Boolean describesVersion;

}
