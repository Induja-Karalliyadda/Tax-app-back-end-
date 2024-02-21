package org.example.controller;

import org.example.dto.Citizen;
import lombok.RequiredArgsConstructor;
import org.example.service.CitizenService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citizen")
@RequiredArgsConstructor
@CrossOrigin
public class CitizenController {
    final CitizenService service;
@PostMapping("/add")
public void addCitizen(@RequestBody Citizen citizen){
    service.addCitizen(citizen);
}

}
