package com.example.neo4j;



import org.springframework.beans.factory.annotation.Autowired;

import com.example.neo4j.domain.Service;

public class ServiceRepositoryImpl implements MyServiceRepository {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Service findServiceNamed(String name) {
        return serviceRepository.findByPropertyValue("name", name);
    }

    @Override
    public Service create(String name) {
        return new Service(name).persist();
    }

}
