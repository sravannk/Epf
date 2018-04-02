package com.mtvi.endpointprofile.service.dto;

import com.mtvi.endpointprofile.domain.Material;

public class FallbackMaterialDTO {
	
	private Long id;

    private String name;

    private Integer fallbackOrder;

    private Material fallbackMaterial;

    private Material parentMaterial;

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

	public Integer getFallbackOrder() {
		return fallbackOrder;
	}

	public void setFallbackOrder(Integer fallbackOrder) {
		this.fallbackOrder = fallbackOrder;
	}

	public Material getFallbackMaterial() {
		return fallbackMaterial;
	}

	public void setFallbackMaterial(Material fallbackMaterial) {
		this.fallbackMaterial = fallbackMaterial;
	}

	public Material getParentMaterial() {
		return parentMaterial;
	}

	public void setParentMaterial(Material parentMaterial) {
		this.parentMaterial = parentMaterial;
	}
    
    


}
