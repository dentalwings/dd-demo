FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY --from=datadog/serverless-init:1.1.3-rc1 /datadog-init /app/datadog-init
ADD https://dtdg.co/latest-java-tracer dd-java-agent.jar

COPY build/libs/dd-demo-0.0.1-SNAPSHOT.jar service.jar

ENV DD_TRACE_SAMPLE_RATE=1

EXPOSE 8080
ENTRYPOINT ["/app/datadog-init"]
CMD java -javaagent:dd-java-agent.jar -jar service.jar