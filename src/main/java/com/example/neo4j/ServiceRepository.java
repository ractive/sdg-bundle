package com.example.neo4j;



import org.springframework.data.graph.neo4j.repository.GraphRepository;
import org.springframework.data.graph.neo4j.repository.NamedIndexRepository;

import com.example.neo4j.domain.Service;

public interface ServiceRepository extends GraphRepository<Service> {

}
