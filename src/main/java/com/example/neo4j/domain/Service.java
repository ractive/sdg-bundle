package com.example.neo4j.domain;

import java.util.Set;

import org.springframework.data.graph.annotation.NodeEntity;
import org.springframework.data.graph.annotation.RelatedTo;
import org.springframework.data.graph.core.Direction;
import org.springframework.data.graph.neo4j.annotation.Indexed;

@NodeEntity
public class Service {
    @Indexed
    private String name;

    @RelatedTo(direction = Direction.BOTH, elementClass = Service.class)
    private Set<Service> dependents;

    public Service() {
    }

    public Service(String name) {
        this.name = name;
    }

    private void knows(Service d) {
        dependents.add(d);
    }

    public String getName() {
        return name;
    }
}
