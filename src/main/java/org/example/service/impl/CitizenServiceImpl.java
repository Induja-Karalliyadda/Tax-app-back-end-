package org.example.service.impl;

import org.example.dto.Citizen;
import org.example.entity.CitizenEntity;
import org.example.repository.CitizenRepository;
import org.example.service.CitizenService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitizenServiceImpl implements CitizenService {
    @Autowired
    CitizenRepository repository;

    ModelMapper mapper;
    @Bean
    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addCitizen(Citizen citizen) {
        CitizenEntity entity=mapper.map(citizen, CitizenEntity.class);
        repository.save(entity);
    }

    @Override
    public List<CitizenEntity> getCitizen() {
        return null;
    }

    @Override
    public boolean deleteCitizen(Long id) {
        return false;
    }

    @Override
    public Citizen getCitizenId(Long id) {
        return null;
    }
}
