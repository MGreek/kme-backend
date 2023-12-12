package com.example.kmebackend.modelmapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentGraphicHintsDto {
    @JsonProperty("lineHeight")
    private double lineHeight;
    @JsonProperty("spaceHeight")
    private double spaceHeight;
}
