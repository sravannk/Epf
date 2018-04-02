package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Material.
 */
@Entity
@Table(name = "material")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "material_template")
    private String materialTemplate;

    @ManyToOne
    private MaterialType materialType;

    @ManyToOne
    private Language language;

    @ManyToOne
    private ContentLevel contentLevel;

    @ManyToOne
    private ContentDescriptor contentDescriptor;

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

    public Material name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterialTemplate() {
        return materialTemplate;
    }

    public Material materialTemplate(String materialTemplate) {
        this.materialTemplate = materialTemplate;
        return this;
    }

    public void setMaterialTemplate(String materialTemplate) {
        this.materialTemplate = materialTemplate;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public Material materialType(MaterialType materialType) {
        this.materialType = materialType;
        return this;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public Language getLanguage() {
        return language;
    }

    public Material language(Language language) {
        this.language = language;
        return this;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public ContentLevel getContentLevel() {
        return contentLevel;
    }

    public Material contentLevel(ContentLevel contentLevel) {
        this.contentLevel = contentLevel;
        return this;
    }

    public void setContentLevel(ContentLevel contentLevel) {
        this.contentLevel = contentLevel;
    }

    public ContentDescriptor getContentDescriptor() {
        return contentDescriptor;
    }

    public Material contentDescriptor(ContentDescriptor contentDescriptor) {
        this.contentDescriptor = contentDescriptor;
        return this;
    }

    public void setContentDescriptor(ContentDescriptor contentDescriptor) {
        this.contentDescriptor = contentDescriptor;
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
        Material material = (Material) o;
        if (material.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), material.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Material{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", materialTemplate='" + getMaterialTemplate() + "'" +
            "}";
    }
}
