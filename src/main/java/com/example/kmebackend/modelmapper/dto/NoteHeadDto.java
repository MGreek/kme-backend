package com.example.kmebackend.modelmapper.dto;

import com.example.kmebackend.model.NoteCluster.Accidental;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteHeadDto {
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("accidental")
    private Accidental accidental;
}
