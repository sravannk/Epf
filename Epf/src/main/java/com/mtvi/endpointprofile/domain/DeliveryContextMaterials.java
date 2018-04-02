package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DeliveryContextMaterials.
 */
@Entity
@Table(name = "delivery_context_materials")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DeliveryContextMaterials implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "destination_template")
    private String destinationTemplate;

    @ManyToOne
    private PackageStructure packageStructure;

    @ManyToOne
    private Material material;

    @ManyToOne
    private DeliveryMethod deliveryMethod;

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

    public DeliveryContextMaterials name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestinationTemplate() {
        return destinationTemplate;
    }

    public DeliveryContextMaterials destinationTemplate(String destinationTemplate) {
        this.destinationTemplate = destinationTemplate;
        return this;
    }

    public void setDestinationTemplate(String destinationTemplate) {
        this.destinationTemplate = destinationTemplate;
    }

    public PackageStructure getPackageStructure() {
        return packageStructure;
    }

    public DeliveryContextMaterials packageStructure(PackageStructure packageStructure) {
        this.packageStructure = packageStructure;
        return this;
    }

    public void setPackageStructure(PackageStructure packageStructure) {
        this.packageStructure = packageStructure;
    }

    public Material getMaterial() {
        return material;
    }

    public DeliveryContextMaterials material(Material material) {
        this.material = material;
        return this;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public DeliveryContextMaterials deliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        return this;
    }

    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
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
        DeliveryContextMaterials deliveryContextMaterials = (DeliveryContextMaterials) o;
        if (deliveryContextMaterials.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), deliveryContextMaterials.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DeliveryContextMaterials{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", destinationTemplate='" + getDestinationTemplate() + "'" +
            "}";
    }
}
