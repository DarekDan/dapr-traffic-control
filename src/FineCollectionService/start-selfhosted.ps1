dapr run `
    --app-id finecollectionservice `
    --app-port 6001 `
    --dapr-http-port 3601 `
    --dapr-grpc-port 3701 `
    --config ../dapr/config/config.yaml `
    --components-path ../dapr/components `
    dotnet run