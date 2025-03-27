package com.example.buyogo.demo.TrainingCentre.dto;

import com.example.buyogo.demo.TrainingCentre.AddressDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class TrainingCenterResponseDto {

    private Long id;
    private String trainingCenterName;
    private String centerCode;
    private AddressDto address;
    private Integer studentStrength;
    private List<String> courses;
    private String email;
    private String phoneNum;


    public TrainingCenterResponseDto(Long id, String trainingCenterName, String centerCode, AddressDto address, Integer studentStrength, List<String> courses, String email, String phoneNum, Long createdOn) {
        this.id = id;
        this.trainingCenterName = trainingCenterName;
        this.centerCode = centerCode;
        this.address = address;
        this.studentStrength = studentStrength;
        this.courses = courses;
        this.email = email;
        this.phoneNum = phoneNum;

    }


}
