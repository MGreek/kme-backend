package com.example.kmebackend.model.Voice;

import com.example.kmebackend.model.Measure.Measure;
import com.example.kmebackend.model.NoteCluster.NoteCluster;
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
public class Voice {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Measure measure;

    @OneToMany(mappedBy = "voice", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
    @OrderColumn
    private List<NoteCluster> noteClusters;

    @Embedded
    private GraphicHints graphicHints;
}
