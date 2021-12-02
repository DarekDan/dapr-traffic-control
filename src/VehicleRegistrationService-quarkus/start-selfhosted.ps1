dapr run `
    --app-id vehicleregistrationservice `
    --app-port 6002 `
    --dapr-http-port 3602 `
    --dapr-grpc-port 3702 `
    --config ../dapr/config/config.yaml `
    --components-path ../dapr/components `
    -- java -jar target/vehicle-registration-service-1.0-SNAPSHOT-runner.jar
