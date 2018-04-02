package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A MaterialVideoRequirements.
 */
@Entity
@Table(name = "material_video_requirements")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MaterialVideoRequirements implements Serializable {

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
    private TechVideoRequirements videoRequirement;

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

    public MaterialVideoRequirements name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public MaterialVideoRequirements material(Material material) {
        this.material = material;
        return this;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public TechVideoRequirements getVideoRequirement() {
        return videoRequirement;
    }

    public MaterialVideoRequirements videoRequirement(TechVideoRequirements techVideoRequirements) {
        this.videoRequirement = techVideoRequirements;
        return this;
    }

    public void setVideoRequirement(TechVideoRequirements techVideoRequirements) {
        this.videoRequirement = techVideoRequirements;
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
        MaterialVideoRequirements materialVideoRequirements = (MaterialVideoRequirements) o;
        if (materialVideoRequirements.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), materialVideoRequirements.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MaterialVideoRequirements{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
