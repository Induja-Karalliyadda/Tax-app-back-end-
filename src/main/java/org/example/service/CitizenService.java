package org.example.service;

import org.example.dto.Citizen;
import org.example.entity.CitizenEntity;

import java.util.List;

public interface CitizenService {
    void addCitizen(Citizen citizen);
    List<CitizenEntity> getCitizen();
    boolean deleteCitizen(Long id);
    Citizen getCitizenId(Long id);
}
