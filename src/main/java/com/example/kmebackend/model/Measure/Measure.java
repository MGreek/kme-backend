package com.example.kmebackend.model.Measure;

import com.example.kmebackend.model.Staff.Staff;
import com.example.kmebackend.model.Voice.Voice;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Measure {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Staff staff;

    @OneToMany(mappedBy = "measure", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
    @OrderColumn
    private List<Voice> voices;

    @Embedded
    private PureMeasure pureMeasure;

    @Embedded
    private GraphicHints hints;
}
