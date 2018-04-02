package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A TechAudioRequirements.
 */
@Entity
@Table(name = "tech_audio_requirements")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TechAudioRequirements implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "audio_sample_rate")
    private Integer audioSampleRate;

    @Column(name = "audio_bit_depth")
    private Integer audioBitDepth;

    @Column(name = "audio_channels")
    private Integer audioChannels;

    @Column(name = "audio_channel_configuration")
    private String audioChannelConfiguration;

    @Column(name = "audio_track_configuration")
    private String audioTrackConfiguration;

    @Column(name = "time_code_start_time")
    private Integer timeCodeStartTime;

    @Column(name = "time_code_type")
    private String timeCodeType;

    @Column(name = "caption_embedded")
    private Boolean captionEmbedded;

    @ManyToOne
    private Codec audioCodec;

    @ManyToOne
    private EncodingFormat encodingFormat;

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

    public TechAudioRequirements name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public TechAudioRequirements description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAudioSampleRate() {
        return audioSampleRate;
    }

    public TechAudioRequirements audioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
        return this;
    }

    public void setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    public Integer getAudioBitDepth() {
        return audioBitDepth;
    }

    public TechAudioRequirements audioBitDepth(Integer audioBitDepth) {
        this.audioBitDepth = audioBitDepth;
        return this;
    }

    public void setAudioBitDepth(Integer audioBitDepth) {
        this.audioBitDepth = audioBitDepth;
    }

    public Integer getAudioChannels() {
        return audioChannels;
    }

    public TechAudioRequirements audioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }

    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }

    public String getAudioChannelConfiguration() {
        return audioChannelConfiguration;
    }

    public TechAudioRequirements audioChannelConfiguration(String audioChannelConfiguration) {
        this.audioChannelConfiguration = audioChannelConfiguration;
        return this;
    }

    public void setAudioChannelConfiguration(String audioChannelConfiguration) {
        this.audioChannelConfiguration = audioChannelConfiguration;
    }

    public String getAudioTrackConfiguration() {
        return audioTrackConfiguration;
    }

    public TechAudioRequirements audioTrackConfiguration(String audioTrackConfiguration) {
        this.audioTrackConfiguration = audioTrackConfiguration;
        return this;
    }

    public void setAudioTrackConfiguration(String audioTrackConfiguration) {
        this.audioTrackConfiguration = audioTrackConfiguration;
    }

    public Integer getTimeCodeStartTime() {
        return timeCodeStartTime;
    }

    public TechAudioRequirements timeCodeStartTime(Integer timeCodeStartTime) {
        this.timeCodeStartTime = timeCodeStartTime;
        return this;
    }

    public void setTimeCodeStartTime(Integer timeCodeStartTime) {
        this.timeCodeStartTime = timeCodeStartTime;
    }

    public String getTimeCodeType() {
        return timeCodeType;
    }

    public TechAudioRequirements timeCodeType(String timeCodeType) {
        this.timeCodeType = timeCodeType;
        return this;
    }

    public void setTimeCodeType(String timeCodeType) {
        this.timeCodeType = timeCodeType;
    }

    public Boolean isCaptionEmbedded() {
        return captionEmbedded;
    }

    public TechAudioRequirements captionEmbedded(Boolean captionEmbedded) {
        this.captionEmbedded = captionEmbedded;
        return this;
    }

    public void setCaptionEmbedded(Boolean captionEmbedded) {
        this.captionEmbedded = captionEmbedded;
    }

    public Codec getAudioCodec() {
        return audioCodec;
    }

    public TechAudioRequirements audioCodec(Codec codec) {
        this.audioCodec = codec;
        return this;
    }

    public void setAudioCodec(Codec codec) {
        this.audioCodec = codec;
    }

    public EncodingFormat getEncodingFormat() {
        return encodingFormat;
    }

    public TechAudioRequirements encodingFormat(EncodingFormat encodingFormat) {
        this.encodingFormat = encodingFormat;
        return this;
    }

    public void setEncodingFormat(EncodingFormat encodingFormat) {
        this.encodingFormat = encodingFormat;
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
        TechAudioRequirements techAudioRequirements = (TechAudioRequirements) o;
        if (techAudioRequirements.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), techAudioRequirements.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TechAudioRequirements{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", audioSampleRate='" + getAudioSampleRate() + "'" +
            ", audioBitDepth='" + getAudioBitDepth() + "'" +
            ", audioChannels='" + getAudioChannels() + "'" +
            ", audioChannelConfiguration='" + getAudioChannelConfiguration() + "'" +
            ", audioTrackConfiguration='" + getAudioTrackConfiguration() + "'" +
            ", timeCodeStartTime='" + getTimeCodeStartTime() + "'" +
            ", timeCodeType='" + getTimeCodeType() + "'" +
            ", captionEmbedded='" + isCaptionEmbedded() + "'" +
            "}";
    }
}
