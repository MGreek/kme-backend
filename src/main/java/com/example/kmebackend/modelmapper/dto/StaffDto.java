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
public class StaffDto {
    @JsonProperty("id")
    private UUID id;

    @JsonBackReference
    @JsonProperty("staffGroup")
    private StaffGroupDto staffGroup;

    @JsonManagedReference
    @JsonProperty("measures")
    private List<MeasureDto> measures;

    @JsonProperty("hints")
    private StaffGraphicHintsDto hints;
}
