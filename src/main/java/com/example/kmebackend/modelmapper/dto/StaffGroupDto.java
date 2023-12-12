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
public class StaffGroupDto {
    @JsonProperty("id")
    private UUID id;

    @JsonBackReference
    @JsonProperty("document")
    private DocumentDto document;

    @JsonManagedReference
    @JsonProperty("staves")
    private List<StaffDto> staves;

    @JsonProperty("hints")
    private StaffGroupGraphicHintsDto hints;
}
