# Introduction 
Simple example of a springboot service to help me test Datadog integration.

# Getting Started

build and push the project with:
`loop.ps1`

then, run the image locally with:

```
docker run  `
  -e DD_API_KEY='secret' `
  -e DD_APP_KEY='secret' `
  -e DD_ENV='localdev' `
  -e DD_LOGS_ENABLED='true' `
  -e DD_SERVICE='dddemo' `
  -e DD_HOSTNAME='localdev' `
  -p 8080:8080 `
```

orm run on Azure Web App with:

`az webapp config container set --docker-custom-image-name acrgcaccspipeline01.azurecr.io/dentalwings.dddemo:latest --name awa-l-dddemo-cac-01 --resource-group arg-l-dddemo-cac-01`

# Build and Test

run the following curl commands multiple times

local endpoint:

`curl http://localhost:8080/`

azure endpoint:

`curl http://awa-l-dddemo-cac-01.azurewebsites.net/`

and navigate to this dtadog URL.

We expect an equal number of:

`1332 First line of log`
and
`1332 Second line of log`
