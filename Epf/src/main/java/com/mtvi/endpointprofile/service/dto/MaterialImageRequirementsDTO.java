package com.mtvi.endpointprofile.service.dto;

import com.mtvi.endpointprofile.domain.Material;
import com.mtvi.endpointprofile.domain.TechImageRequirements;

public class MaterialImageRequirementsDTO {

	private Long id;

	private String name;

	private Material material;

	private TechImageRequirements imageRequirement;

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

	public TechImageRequirements getImageRequirement() {
		return imageRequirement;
	}

	public void setImageRequirement(TechImageRequirements imageRequirement) {
		this.imageRequirement = imageRequirement;
	}
	
	

}
