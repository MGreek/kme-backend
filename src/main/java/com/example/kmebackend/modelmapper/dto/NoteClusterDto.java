package com.example.kmebackend.modelmapper.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class NoteClusterDto {
    @JsonProperty("id")
    private UUID id;

    @JsonBackReference
    @JsonProperty("voice")
    private VoiceDto voice;

    @JsonProperty("pureNoteCluster")
    private PureNoteClusterDto pureNoteCluster;

    @JsonProperty("hints")
    private NoteClusterGraphicHintsDto hints;
}
