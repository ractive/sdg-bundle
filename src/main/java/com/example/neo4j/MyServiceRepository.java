package com.example.neo4j;



import org.springframework.transaction.annotation.Transactional;

import com.example.neo4j.domain.Service;

public interface MyServiceRepository {
    @Transactional
    Service create(String name);

    Service findServiceNamed(String name);
}
