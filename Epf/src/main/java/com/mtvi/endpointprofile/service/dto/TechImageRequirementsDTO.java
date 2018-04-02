package com.mtvi.endpointprofile.service.dto;

import com.mtvi.endpointprofile.domain.Dimension;
import com.mtvi.endpointprofile.domain.ImageType;

public class TechImageRequirementsDTO {
	private Long id;

	private String name;

	private Integer ppi;

	private String imageContentRelationship;

	private String description;

	private String shape;

	private Dimension dimension;

	private ImageType imageType;

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

	public Integer getPpi() {
		return ppi;
	}

	public void setPpi(Integer ppi) {
		this.ppi = ppi;
	}

	public String getImageContentRelationship() {
		return imageContentRelationship;
	}

	public void setImageContentRelationship(String imageContentRelationship) {
		this.imageContentRelationship = imageContentRelationship;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public ImageType getImageType() {
		return imageType;
	}

	public void setImageType(ImageType imageType) {
		this.imageType = imageType;
	}
	
	

}
