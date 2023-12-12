package com.example.kmebackend.service;

import com.example.kmebackend.model.Document.Document;
import com.example.kmebackend.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository repo;

    public List<Document> getDocuments() {
        List<Document> documents = repo.findAll();
        if (documents.isEmpty()) {
            documents.add(Document.getDefaultDocument());
        }
        return documents;
    }
}
