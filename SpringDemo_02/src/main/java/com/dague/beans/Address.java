package com.dague.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
    String fullAddress;

    public Address() {
        fullAddress = "This is the full address";
    }

    public Address(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "fullAddress='" + fullAddress + '\'' +
                '}';
    }
}
