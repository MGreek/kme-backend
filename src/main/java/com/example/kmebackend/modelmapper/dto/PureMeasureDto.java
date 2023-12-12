package com.example.kmebackend.modelmapper.dto;

import com.example.kmebackend.model.Measure.Clef;
import com.example.kmebackend.model.Measure.TimeSignature;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PureMeasureDto {
    @JsonProperty("clef")
    Clef clef;
    @JsonProperty("armor")
    Integer armor;
    @JsonProperty("timeSignature")
    TimeSignature timeSignature;
}
