package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A TechImageRequirements.
 */
@Entity
@Table(name = "tech_image_requirements")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TechImageRequirements implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ppi")
    private Integer ppi;

    @Column(name = "image_content_relationship")
    private String imageContentRelationship;

    @Column(name = "description")
    private String description;

    @Column(name = "shape")
    private String shape;

    @ManyToOne
    private Dimension dimension;

    @ManyToOne
    private ImageType imageType;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public TechImageRequirements name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPpi() {
        return ppi;
    }

    public TechImageRequirements ppi(Integer ppi) {
        this.ppi = ppi;
        return this;
    }

    public void setPpi(Integer ppi) {
        this.ppi = ppi;
    }

    public String getImageContentRelationship() {
        return imageContentRelationship;
    }

    public TechImageRequirements imageContentRelationship(String imageContentRelationship) {
        this.imageContentRelationship = imageContentRelationship;
        return this;
    }

    public void setImageContentRelationship(String imageContentRelationship) {
        this.imageContentRelationship = imageContentRelationship;
    }

    public String getDescription() {
        return description;
    }

    public TechImageRequirements description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShape() {
        return shape;
    }

    public TechImageRequirements shape(String shape) {
        this.shape = shape;
        return this;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public TechImageRequirements dimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public ImageType getImageType() {
        return imageType;
    }

    public TechImageRequirements imageType(ImageType imageType) {
        this.imageType = imageType;
        return this;
    }

    public void setImageType(ImageType imageType) {
        this.imageType = imageType;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TechImageRequirements techImageRequirements = (TechImageRequirements) o;
        if (techImageRequirements.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), techImageRequirements.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TechImageRequirements{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", ppi='" + getPpi() + "'" +
            ", imageContentRelationship='" + getImageContentRelationship() + "'" +
            ", description='" + getDescription() + "'" +
            ", shape='" + getShape() + "'" +
            "}";
    }
}
