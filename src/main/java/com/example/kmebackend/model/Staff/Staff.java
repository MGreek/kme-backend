package com.example.kmebackend.model.Staff;

import com.example.kmebackend.model.Measure.Measure;
import com.example.kmebackend.model.StaffGroup.StaffGroup;
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
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private StaffGroup staffGroup;

    @OneToMany(mappedBy = "staff", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
    @OrderColumn
    private List<Measure> measures;

    @Embedded
    private GraphicHints hints;
}