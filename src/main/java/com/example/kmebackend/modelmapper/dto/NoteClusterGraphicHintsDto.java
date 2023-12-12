package com.example.kmebackend.modelmapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteClusterGraphicHintsDto {
    @JsonProperty("upsideDown")
    boolean upsideDown;
}
