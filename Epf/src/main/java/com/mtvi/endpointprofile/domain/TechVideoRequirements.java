package com.mtvi.endpointprofile.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A TechVideoRequirements.
 */
@Entity
@Table(name = "tech_video_requirements")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TechVideoRequirements implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "frame_rate")
    private Double frameRate;

    @Column(name = "video_avg_bit_rate")
    private Double videoAvgBitRate;

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

    @Column(name = "x_ppi")
    private Integer xPpi;

    @Column(name = "y_ppi")
    private Integer yPpi;

    @Column(name = "audio_track_configuration")
    private String audioTrackConfiguration;

    @Column(name = "time_code_start_time")
    private Integer timeCodeStartTime;

    @Column(name = "time_code_type")
    private String timeCodeType;

    @Column(name = "caption_embedded")
    private Boolean captionEmbedded;

    @ManyToOne
    private Dimension dimension;

    @ManyToOne
    private EncodingFormat encodingFormat;

    @ManyToOne
    private AspectRatio storageAspectRatio;

    @ManyToOne
    private AspectRatio displayAspectRatio;

    @ManyToOne
    private Codec videoCodec;

    @ManyToOne
    private ScanType scanType;

    @ManyToOne
    private Codec audioCodec;

    @ManyToOne
    private Specification specification;

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

    public TechVideoRequirements name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFrameRate() {
        return frameRate;
    }

    public TechVideoRequirements frameRate(Double frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    public Double getVideoAvgBitRate() {
        return videoAvgBitRate;
    }

    public TechVideoRequirements videoAvgBitRate(Double videoAvgBitRate) {
        this.videoAvgBitRate = videoAvgBitRate;
        return this;
    }

    public void setVideoAvgBitRate(Double videoAvgBitRate) {
        this.videoAvgBitRate = videoAvgBitRate;
    }

    public String getDescription() {
        return description;
    }

    public TechVideoRequirements description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAudioSampleRate() {
        return audioSampleRate;
    }

    public TechVideoRequirements audioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
        return this;
    }

    public void setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    public Integer getAudioBitDepth() {
        return audioBitDepth;
    }

    public TechVideoRequirements audioBitDepth(Integer audioBitDepth) {
        this.audioBitDepth = audioBitDepth;
        return this;
    }

    public void setAudioBitDepth(Integer audioBitDepth) {
        this.audioBitDepth = audioBitDepth;
    }

    public Integer getAudioChannels() {
        return audioChannels;
    }

    public TechVideoRequirements audioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }

    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }

    public String getAudioChannelConfiguration() {
        return audioChannelConfiguration;
    }

    public TechVideoRequirements audioChannelConfiguration(String audioChannelConfiguration) {
        this.audioChannelConfiguration = audioChannelConfiguration;
        return this;
    }

    public void setAudioChannelConfiguration(String audioChannelConfiguration) {
        this.audioChannelConfiguration = audioChannelConfiguration;
    }

    public Integer getxPpi() {
        return xPpi;
    }

    public TechVideoRequirements xPpi(Integer xPpi) {
        this.xPpi = xPpi;
        return this;
    }

    public void setxPpi(Integer xPpi) {
        this.xPpi = xPpi;
    }

    public Integer getyPpi() {
        return yPpi;
    }

    public TechVideoRequirements yPpi(Integer yPpi) {
        this.yPpi = yPpi;
        return this;
    }

    public void setyPpi(Integer yPpi) {
        this.yPpi = yPpi;
    }

    public String getAudioTrackConfiguration() {
        return audioTrackConfiguration;
    }

    public TechVideoRequirements audioTrackConfiguration(String audioTrackConfiguration) {
        this.audioTrackConfiguration = audioTrackConfiguration;
        return this;
    }

    public void setAudioTrackConfiguration(String audioTrackConfiguration) {
        this.audioTrackConfiguration = audioTrackConfiguration;
    }

    public Integer getTimeCodeStartTime() {
        return timeCodeStartTime;
    }

    public TechVideoRequirements timeCodeStartTime(Integer timeCodeStartTime) {
        this.timeCodeStartTime = timeCodeStartTime;
        return this;
    }

    public void setTimeCodeStartTime(Integer timeCodeStartTime) {
        this.timeCodeStartTime = timeCodeStartTime;
    }

    public String getTimeCodeType() {
        return timeCodeType;
    }

    public TechVideoRequirements timeCodeType(String timeCodeType) {
        this.timeCodeType = timeCodeType;
        return this;
    }

    public void setTimeCodeType(String timeCodeType) {
        this.timeCodeType = timeCodeType;
    }

    public Boolean isCaptionEmbedded() {
        return captionEmbedded;
    }

    public TechVideoRequirements captionEmbedded(Boolean captionEmbedded) {
        this.captionEmbedded = captionEmbedded;
        return this;
    }

    public void setCaptionEmbedded(Boolean captionEmbedded) {
        this.captionEmbedded = captionEmbedded;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public TechVideoRequirements dimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public EncodingFormat getEncodingFormat() {
        return encodingFormat;
    }

    public TechVideoRequirements encodingFormat(EncodingFormat encodingFormat) {
        this.encodingFormat = encodingFormat;
        return this;
    }

    public void setEncodingFormat(EncodingFormat encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public AspectRatio getStorageAspectRatio() {
        return storageAspectRatio;
    }

    public TechVideoRequirements storageAspectRatio(AspectRatio aspectRatio) {
        this.storageAspectRatio = aspectRatio;
        return this;
    }

    public void setStorageAspectRatio(AspectRatio aspectRatio) {
        this.storageAspectRatio = aspectRatio;
    }

    public AspectRatio getDisplayAspectRatio() {
        return displayAspectRatio;
    }

    public TechVideoRequirements displayAspectRatio(AspectRatio aspectRatio) {
        this.displayAspectRatio = aspectRatio;
        return this;
    }

    public void setDisplayAspectRatio(AspectRatio aspectRatio) {
        this.displayAspectRatio = aspectRatio;
    }

    public Codec getVideoCodec() {
        return videoCodec;
    }

    public TechVideoRequirements videoCodec(Codec codec) {
        this.videoCodec = codec;
        return this;
    }

    public void setVideoCodec(Codec codec) {
        this.videoCodec = codec;
    }

    public ScanType getScanType() {
        return scanType;
    }

    public TechVideoRequirements scanType(ScanType scanType) {
        this.scanType = scanType;
        return this;
    }

    public void setScanType(ScanType scanType) {
        this.scanType = scanType;
    }

    public Codec getAudioCodec() {
        return audioCodec;
    }

    public TechVideoRequirements audioCodec(Codec codec) {
        this.audioCodec = codec;
        return this;
    }

    public void setAudioCodec(Codec codec) {
        this.audioCodec = codec;
    }

    public Specification getSpecification() {
        return specification;
    }

    public TechVideoRequirements specification(Specification specification) {
        this.specification = specification;
        return this;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
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
        TechVideoRequirements techVideoRequirements = (TechVideoRequirements) o;
        if (techVideoRequirements.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), techVideoRequirements.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TechVideoRequirements{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", frameRate='" + getFrameRate() + "'" +
            ", videoAvgBitRate='" + getVideoAvgBitRate() + "'" +
            ", description='" + getDescription() + "'" +
            ", audioSampleRate='" + getAudioSampleRate() + "'" +
            ", audioBitDepth='" + getAudioBitDepth() + "'" +
            ", audioChannels='" + getAudioChannels() + "'" +
            ", audioChannelConfiguration='" + getAudioChannelConfiguration() + "'" +
            ", xPpi='" + getxPpi() + "'" +
            ", yPpi='" + getyPpi() + "'" +
            ", audioTrackConfiguration='" + getAudioTrackConfiguration() + "'" +
            ", timeCodeStartTime='" + getTimeCodeStartTime() + "'" +
            ", timeCodeType='" + getTimeCodeType() + "'" +
            ", captionEmbedded='" + isCaptionEmbedded() + "'" +
            "}";
    }
}
