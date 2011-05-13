package com.example.neo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.neo4j.domain.Service;

@Component
public class Hello {
    @Autowired
    private ServiceRepositoryImpl serviceRepository;

    public Hello() {
        System.out.println("###### c'tor HELLO! ######");

    }

    public boolean init() {
        Service s = serviceRepository.create("top");
        System.out.println("Created service: " + s.getName());
        return s != null;
    }
}
