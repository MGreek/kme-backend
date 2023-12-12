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
public class MeasureDto {
    @JsonProperty("id")
    private UUID id;

    @JsonBackReference
    @JsonProperty("staff")
    private StaffDto staff;

    @JsonManagedReference
    @JsonProperty("voices")
    private List<VoiceDto> voices;

    @JsonProperty("pureMeasure")
    private PureMeasureDto pureMeasure;

    @JsonProperty("hints")
    private MeasureGraphicHintsDto hints;
}
