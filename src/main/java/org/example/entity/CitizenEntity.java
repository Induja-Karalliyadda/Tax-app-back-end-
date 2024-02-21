package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CitizenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nic;
    private String fullName;
    private String nameWithInitials;
    private int    contactNumber;
    private  String address;
    private  String Gender;
    private String countryOfBirth;
    private String income;
    private int DOB;
    private String pofession;
    private String civilStatus;
}
