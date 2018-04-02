package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A PackageStructure.
 */
@Entity
@Table(name = "package_structure")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PackageStructure implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "delivery_template")
    private String deliveryTemplate;

    @Column(name = "package_template")
    private String packageTemplate;

    @ManyToOne
    private DeliveryContext deliveryContext;

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

    public PackageStructure name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryTemplate() {
        return deliveryTemplate;
    }

    public PackageStructure deliveryTemplate(String deliveryTemplate) {
        this.deliveryTemplate = deliveryTemplate;
        return this;
    }

    public void setDeliveryTemplate(String deliveryTemplate) {
        this.deliveryTemplate = deliveryTemplate;
    }

    public String getPackageTemplate() {
        return packageTemplate;
    }

    public PackageStructure packageTemplate(String packageTemplate) {
        this.packageTemplate = packageTemplate;
        return this;
    }

    public void setPackageTemplate(String packageTemplate) {
        this.packageTemplate = packageTemplate;
    }

    public DeliveryContext getDeliveryContext() {
        return deliveryContext;
    }

    public PackageStructure deliveryContext(DeliveryContext deliveryContext) {
        this.deliveryContext = deliveryContext;
        return this;
    }

    public void setDeliveryContext(DeliveryContext deliveryContext) {
        this.deliveryContext = deliveryContext;
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
        PackageStructure packageStructure = (PackageStructure) o;
        if (packageStructure.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), packageStructure.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PackageStructure{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", deliveryTemplate='" + getDeliveryTemplate() + "'" +
            ", packageTemplate='" + getPackageTemplate() + "'" +
            "}";
    }
}
