package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DeliveryContext.
 */
@Entity
@Table(name = "delivery_context")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DeliveryContext implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    private EntityType entityType;

    @ManyToOne
    private Platform platform;

    @ManyToOne
    private Endpoint endPoint;

    @ManyToOne
    private Channel channel;

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

    public DeliveryContext name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public DeliveryContext status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public DeliveryContext entityType(EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public Platform getPlatform() {
        return platform;
    }

    public DeliveryContext platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Endpoint getEndPoint() {
        return endPoint;
    }

    public DeliveryContext endPoint(Endpoint endpoint) {
        this.endPoint = endpoint;
        return this;
    }

    public void setEndPoint(Endpoint endpoint) {
        this.endPoint = endpoint;
    }

    public Channel getChannel() {
        return channel;
    }

    public DeliveryContext channel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
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
        DeliveryContext deliveryContext = (DeliveryContext) o;
        if (deliveryContext.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), deliveryContext.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DeliveryContext{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
