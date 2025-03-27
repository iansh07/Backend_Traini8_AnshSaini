package com.example.buyogo.demo.TrainingCentre;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;

public class TrainingCenterRequestDto {

    @NotNull(message = "Enter your correct centre name")
    @Size(max = 40, message = "Should not more than 40 characters")
    private String trainingCenterName;

    @NotNull(message = "Center Code is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "exactly 4 numeric characters of centre code")
    private String centerCode;

    @Valid
    @NotNull(message = "Address is required")
    private AddressDto address;

    private Integer studentStrength;

    private List<String> courses;

    @Email(message = "PLease Enter your valid email")
    private String email;

    @NotNull(message = "Mandatory phone number field")
    @Pattern(regexp = "^[0-9]{10}$", message = "Please enter a valid phone number")
    private String phoneNum;

    // Getters and Setters

    public String getTrainingCenterName() {
        return trainingCenterName;
    }

    public void setTrainingCenterName(String trainingCenterName) {
        this.trainingCenterName = trainingCenterName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public Integer getStudentStrength() {
        return studentStrength;
    }

    public void setStudentStrength(Integer studentStrength) {
        this.studentStrength = studentStrength;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
