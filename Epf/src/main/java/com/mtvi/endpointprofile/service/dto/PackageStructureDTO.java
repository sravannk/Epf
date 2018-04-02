package com.mtvi.endpointprofile.service.dto;

import java.util.List;


public class PackageStructureDTO {

	private String name;
	private List<MaterialDTO> materials;

	@Override
	public String toString() {
		return "PackageStructureDTO [name=" + name + ", materials=" + materials + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MaterialDTO> getMaterials() {
		return materials;
	}

	public void setMaterials(List<MaterialDTO> materials) {
		this.materials = materials;
	}

}
