package com.github.dapr.traffic.control.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleInfo {

    private String vehicleId;
    private String brand;
    private String model;
    private String ownerName;
    private String ownerEmail;
}
