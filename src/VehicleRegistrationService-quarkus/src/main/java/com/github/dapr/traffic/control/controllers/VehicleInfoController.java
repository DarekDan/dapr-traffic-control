package com.github.dapr.traffic.control.controllers;

import com.github.dapr.traffic.control.models.VehicleInfo;
import com.github.dapr.traffic.control.repositories.IVehicleInfoRepository;
import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/vehicleinfo")
@ApplicationScoped
public class VehicleInfoController {

    @Inject
    IVehicleInfoRepository vehicleInfoRepository;

    @Inject
    Logger logger;

    @GET
    @Path("/{licenseNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<VehicleInfo> getVeicleInfo(String licenseNumber) {
        logger.info("Request received");
        VehicleInfo info = vehicleInfoRepository.getVehicleInfo(licenseNumber);
        return Uni.createFrom().item(info);
    }

}
