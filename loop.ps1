.\gradlew.bat build

docker build . -t acrgcaccspipeline01.azurecr.io/dentalwings.dddemo:latest

docker push acrgcaccspipeline01.azurecr.io/dentalwings.dddemo:latest
