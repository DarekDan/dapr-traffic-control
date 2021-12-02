package com.github.dapr.traffic.control.repositories;

import com.github.dapr.traffic.control.models.VehicleInfo;
import com.github.javafaker.Faker;
import java.util.Map;
import java.util.Random;
import javax.inject.Singleton;

@Singleton
public class InMemoryVehicleInfoRepository implements IVehicleInfoRepository {

    private final String[] vehicleBrands = new String[]{
        "Mercedes", "Toyota", "Audi", "Volkswagen", "Seat", "Renault", "Skoda",
        "Kia", "Citroën", "Suzuki"};
    private Random random;
    private Faker faker;
    private Map<String, String[]> vehicleModels = Map.of(
        "Mercedes", new String[]{"A Class", "B Class", "C Class", "E Class", "SLS", "SLK"},
        "Toyota", new String[]{"Yaris", "Avensis", "Rav 4", "Prius", "Celica"},
        "Audi", new String[]{"A3", "A4", "A6", "A8", "Q5", "Q7"},
        "Volkswagen", new String[]{"Golf", "Pasat", "Tiguan", "Caddy"},
        "Seat", new String[]{"Leon", "Arona", "Ibiza", "Alhambra"},
        "Renault", new String[]{"Megane", "Clio", "Twingo", "Scenic", "Captur"},
        "Skoda", new String[]{"Octavia", "Fabia", "Superb", "Karoq", "Kodiaq"},
        "Kia", new String[]{"Picanto", "Rio", "Ceed", "XCeed", "Niro", "Sportage"},
        "Citroën", new String[]{"C1", "C2", "C3", "C4", "C4 Cactus", "Berlingo"},
        "Suzuki", new String[]{"Ignis", "Swift", "Vitara", "S-Cross", "Swace", "Jimny"}
        //JAVA only support 10 key-value pairs
    );

    public InMemoryVehicleInfoRepository() {
        random = new Random();
        faker = new Faker();
    }

    @Override
    public VehicleInfo getVehicleInfo(String licenseNumber) {
        //Slow I/O simulation
        try {
            Thread.sleep(5 + random.nextInt(195));
        } catch (InterruptedException ie) {
        }

        String brand = getRandomBrand();
        String model = getRandomModel(brand);

        String ownerName = faker.name().fullName();
        String ownerEmail = faker.internet().emailAddress();

        return new VehicleInfo(licenseNumber, brand, model, ownerName, ownerEmail);
    }

    private String getRandomBrand()
    {
        return vehicleBrands[random.nextInt(vehicleBrands.length)];
    }

    private String getRandomModel(String brand)
    {
        String[] models = vehicleModels.get(brand);
        return models[random.nextInt(models.length)];
    }
}
