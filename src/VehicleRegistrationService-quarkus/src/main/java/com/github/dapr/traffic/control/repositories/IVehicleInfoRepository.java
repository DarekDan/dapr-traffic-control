package com.github.dapr.traffic.control.repositories;

import com.github.dapr.traffic.control.models.VehicleInfo;

public interface IVehicleInfoRepository {

    VehicleInfo getVehicleInfo(String licenseNumber);
}
