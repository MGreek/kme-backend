package com.example.kmebackend.model.StaffGroup;


import com.example.kmebackend.model.Document.Document;
import com.example.kmebackend.model.Staff.Staff;
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
public class StaffGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Document document;

    @OneToMany(mappedBy = "staffGroup", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
    @OrderColumn
    private List<Staff> staves;

    @Embedded
    private GraphicHints hints;
}
