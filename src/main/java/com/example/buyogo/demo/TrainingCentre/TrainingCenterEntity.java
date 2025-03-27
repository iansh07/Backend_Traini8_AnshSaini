package com.example.buyogo.demo.TrainingCentre;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Entity
@Data

public class TrainingCenterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "enter your training centre name")
    @Size(max = 30, message = "Should not more than 30 characters")
    private String trainingCenterName;

    @NotNull(message = "Center Code is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "exactly 12 alphanumeric characters of centre code")
    private String centerCode;

    @Embedded
    @NotNull(message = "required field")
    private AddressDto address;

    private Integer studentStrength;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "training_center_courses", joinColumns = @JoinColumn(name = "center_id"))
    @Column(name = "course_name")
    private List<String> courses;

    @NotNull(message = "Created On cannot be null")
    @Column(nullable = false, updatable = false)
    private Long createdOn;



    @Email(message = " Please Enter your valid email")
    private String email;

    @NotNull(message = "It is an mandatory phone number field")
    @Pattern(regexp = "^[0-9]{10}$", message = "Please enter a valid phone number")
    private String phoneNumber;

    public void setCreatedOn(long epochSecond) {
        this.createdOn = epochSecond;
    }

    public Long getId() {
        return id;
    }

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

    public Long getCreatedOn() {
        return createdOn;
    }

    public TrainingCenterEntity() {
        this.createdOn = Instant.now().getEpochSecond();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNum) {
        this.phoneNumber = phoneNum;
    }
}
