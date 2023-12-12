package com.example.kmebackend.modelmapper.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class DocumentDto {
    @JsonProperty("id")
    private UUID id;

    @JsonProperty("hints")
    private DocumentGraphicHintsDto hints;

    @JsonManagedReference
    @JsonProperty("staffGroups")
    private List<StaffGroupDto> staffGroups;
}
