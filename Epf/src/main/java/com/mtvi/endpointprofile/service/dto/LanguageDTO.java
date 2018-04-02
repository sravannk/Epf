package com.mtvi.endpointprofile.service.dto;

import javax.persistence.Column;

public class LanguageDTO {

	private Long id;

	private String name;

	private String code;

	private String codeIso6392;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeIso6392() {
		return codeIso6392;
	}

	public void setCodeIso6392(String codeIso6392) {
		this.codeIso6392 = codeIso6392;
	}

	public String getCodeBcp47() {
		return codeBcp47;
	}

	public void setCodeBcp47(String codeBcp47) {
		this.codeBcp47 = codeBcp47;
	}

	private String codeBcp47;

}
