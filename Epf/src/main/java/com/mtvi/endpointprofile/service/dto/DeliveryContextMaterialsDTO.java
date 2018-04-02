package com.mtvi.endpointprofile.service.dto;

import com.mtvi.endpointprofile.domain.DeliveryMethod;
import com.mtvi.endpointprofile.domain.Material;
import com.mtvi.endpointprofile.domain.PackageStructure;

public class DeliveryContextMaterialsDTO {

	private Long id;

	private String name;

	private String destinationTemplate;

	private PackageStructure packageStructure;

	private Material material;

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

	public String getDestinationTemplate() {
		return destinationTemplate;
	}

	public void setDestinationTemplate(String destinationTemplate) {
		this.destinationTemplate = destinationTemplate;
	}

	public PackageStructure getPackageStructure() {
		return packageStructure;
	}

	public void setPackageStructure(PackageStructure packageStructure) {
		this.packageStructure = packageStructure;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	private DeliveryMethod deliveryMethod;

}
