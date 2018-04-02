package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A FallbackMaterial.
 */
@Entity
@Table(name = "fallback_material")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FallbackMaterial implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "fallback_order")
    private Integer fallbackOrder;

    @ManyToOne
    private Material fallbackMaterial;

    @ManyToOne
    private Material parentMaterial;

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

    public FallbackMaterial name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFallbackOrder() {
        return fallbackOrder;
    }

    public FallbackMaterial fallbackOrder(Integer fallbackOrder) {
        this.fallbackOrder = fallbackOrder;
        return this;
    }

    public void setFallbackOrder(Integer fallbackOrder) {
        this.fallbackOrder = fallbackOrder;
    }

    public Material getFallbackMaterial() {
        return fallbackMaterial;
    }

    public FallbackMaterial fallbackMaterial(Material material) {
        this.fallbackMaterial = material;
        return this;
    }

    public void setFallbackMaterial(Material material) {
        this.fallbackMaterial = material;
    }

    public Material getParentMaterial() {
        return parentMaterial;
    }

    public FallbackMaterial parentMaterial(Material material) {
        this.parentMaterial = material;
        return this;
    }

    public void setParentMaterial(Material material) {
        this.parentMaterial = material;
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
        FallbackMaterial fallbackMaterial = (FallbackMaterial) o;
        if (fallbackMaterial.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), fallbackMaterial.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "FallbackMaterial{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", fallbackOrder='" + getFallbackOrder() + "'" +
            "}";
    }
}
