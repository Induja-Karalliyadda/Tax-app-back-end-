package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
    private Long id;
    private String nic;//
    private String fullName;//
    private String nameWithInitials;//
    private int    contactNumber;//
    private  String address;//
    private  String Gender;//
    private String countryOfBirth;//
    private String income;//
    private int DOB;//
    private String pofession;//
    private String civilStatus;

}
