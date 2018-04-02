package com.mtvi.endpointprofile.service.dto;

import com.mtvi.endpointprofile.domain.CaptionRequirements;
import com.mtvi.endpointprofile.domain.Material;

public class MaterialCaptionRequirementsDTO {

	private Long id;

	private String name;

	private Material material;

	private CaptionRequirements imageRequirement;

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

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public CaptionRequirements getImageRequirement() {
		return imageRequirement;
	}

	public void setImageRequirement(CaptionRequirements imageRequirement) {
		this.imageRequirement = imageRequirement;
	}
	
	

}
