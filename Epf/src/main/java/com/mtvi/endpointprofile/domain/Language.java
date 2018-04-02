package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Language.
 */
@Entity
@Table(name = "language")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "code_iso_6392")
    private String codeIso6392;

    @Column(name = "code_bcp_47")
    private String codeBcp47;

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

    public Language name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public Language code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeIso6392() {
        return codeIso6392;
    }

    public Language codeIso6392(String codeIso6392) {
        this.codeIso6392 = codeIso6392;
        return this;
    }

    public void setCodeIso6392(String codeIso6392) {
        this.codeIso6392 = codeIso6392;
    }

    public String getCodeBcp47() {
        return codeBcp47;
    }

    public Language codeBcp47(String codeBcp47) {
        this.codeBcp47 = codeBcp47;
        return this;
    }

    public void setCodeBcp47(String codeBcp47) {
        this.codeBcp47 = codeBcp47;
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
        Language language = (Language) o;
        if (language.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), language.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Language{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", code='" + getCode() + "'" +
            ", codeIso6392='" + getCodeIso6392() + "'" +
            ", codeBcp47='" + getCodeBcp47() + "'" +
            "}";
    }
}
