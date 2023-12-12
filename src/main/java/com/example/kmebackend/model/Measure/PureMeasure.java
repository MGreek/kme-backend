package com.example.kmebackend.model.Measure;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PureMeasure {
    Clef clef;
    Integer armor;
    TimeSignature timeSignature;
}
