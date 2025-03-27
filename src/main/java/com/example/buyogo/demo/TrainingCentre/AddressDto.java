package com.example.buyogo.demo.TrainingCentre;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AddressDto {

    @NotNull(message = "State is required")
    private String state;

    @NotNull(message = "City is required")
    private String city;

    @NotNull(message = "Detailed address is required")
    @Size(max = 100, message = "Address should not exceed 100 characters")
    private String addressLine;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }
}
