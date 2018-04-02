package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A MetadataRequirements.
 */
@Entity
@Table(name = "metadata_requirements")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MetadataRequirements implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "jhi_schema")
    private String schema;

    @Column(name = "schema_url")
    private String schemaUrl;

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

    public MetadataRequirements name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchema() {
        return schema;
    }

    public MetadataRequirements schema(String schema) {
        this.schema = schema;
        return this;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getSchemaUrl() {
        return schemaUrl;
    }

    public MetadataRequirements schemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }

    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
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
        MetadataRequirements metadataRequirements = (MetadataRequirements) o;
        if (metadataRequirements.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), metadataRequirements.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MetadataRequirements{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", schema='" + getSchema() + "'" +
            ", schemaUrl='" + getSchemaUrl() + "'" +
            "}";
    }
}
