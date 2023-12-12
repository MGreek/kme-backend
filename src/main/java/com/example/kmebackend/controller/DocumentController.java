package com.example.kmebackend.controller;

import com.example.kmebackend.modelmapper.dto.DocumentDto;
import com.example.kmebackend.service.DocumentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/document")
public class DocumentController {
    @Autowired
    private DocumentService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<DocumentDto>> findAll() {
        try {
            ModelMapper mapper = new ModelMapper();
            List<DocumentDto> documentDtos = service.getDocuments()
                    .stream()
                    .map(document -> mapper.map(document, DocumentDto.class))
                    .toList();
            return ResponseEntity.ok().body(documentDtos);
        }
        catch (Exception ex) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
