package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A MaterialImageRequirements.
 */
@Entity
@Table(name = "material_image_requirements")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MaterialImageRequirements implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Material material;

    @ManyToOne
    private TechImageRequirements imageRequirement;

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

    public MaterialImageRequirements name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public MaterialImageRequirements material(Material material) {
        this.material = material;
        return this;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public TechImageRequirements getImageRequirement() {
        return imageRequirement;
    }

    public MaterialImageRequirements imageRequirement(TechImageRequirements techImageRequirements) {
        this.imageRequirement = techImageRequirements;
        return this;
    }

    public void setImageRequirement(TechImageRequirements techImageRequirements) {
        this.imageRequirement = techImageRequirements;
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
        MaterialImageRequirements materialImageRequirements = (MaterialImageRequirements) o;
        if (materialImageRequirements.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), materialImageRequirements.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MaterialImageRequirements{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
