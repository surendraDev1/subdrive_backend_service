package com.example.subdrive.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HostDocuments implements Documents{
    @Override
    public List<String> getDocuments(String hostId) {
        return null;
    }
}
