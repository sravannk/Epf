package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ContentDescriptor.
 */
@Entity
@Table(name = "content_descriptor")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ContentDescriptor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "describes_version")
    private Boolean describesVersion;

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

    public ContentDescriptor name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isDescribesVersion() {
        return describesVersion;
    }

    public ContentDescriptor describesVersion(Boolean describesVersion) {
        this.describesVersion = describesVersion;
        return this;
    }

    public void setDescribesVersion(Boolean describesVersion) {
        this.describesVersion = describesVersion;
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
        ContentDescriptor contentDescriptor = (ContentDescriptor) o;
        if (contentDescriptor.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), contentDescriptor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ContentDescriptor{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", describesVersion='" + isDescribesVersion() + "'" +
            "}";
    }
}
