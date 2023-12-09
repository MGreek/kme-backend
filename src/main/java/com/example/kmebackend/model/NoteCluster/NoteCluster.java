package com.example.kmebackend.model.NoteCluster;

import com.example.kmebackend.model.Voice.Voice;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoteCluster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Voice voice;

    @Embedded
    private PureNoteCluster pureNoteCluster;

    @Embedded
    private GraphicHints hints;
}
