package com.example.kmebackend.modelmapper.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class VoiceDto {
    @JsonProperty("id")
    private UUID id;

    @JsonBackReference
    @JsonProperty("measure")
    private MeasureDto measure;

    @JsonManagedReference
    @JsonProperty("noteClusters")
    private List<NoteClusterDto> noteClusters;

    @JsonProperty("graphicHints")
    private VoiceGraphicHintsDto graphicHints;
}
