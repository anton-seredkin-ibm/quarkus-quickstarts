# AGENTS

## Gradle Migration Steps (Local)

- Generated Gradle files with `gradle init` and kept the wrapper.
- Configured the wrapper to use a local Gradle 8.14 distribution:
  - `gradle/wrapper/gradle-wrapper.properties` points to `file:/Users/anton/instana-bob/quarkus-quickstarts/.gradle/gradle-8.14-bin.zip`.
  - The local Gradle distribution lives in `.gradle/gradle-8.14/` and is gitignored.
- Root Gradle configuration:
  - `settings.gradle.kts` includes only `getting-started-reactive` (all other modules commented out).
  - `build.gradle.kts` adds Quarkus BOM and Jib dependency to all subprojects.
  - `getting-started-reactive` gets module-specific dependencies (`quarkus-rest`, `quarkus-junit`, `rest-assured`).
- Verified:
  - `./gradlew clean`
  - `./gradlew testClasses`
  - `./gradlew test`

## Latest Build Status

- `./gradlew testClasses` BUILD SUCCESSFUL (getting-started-reactive)
- `./gradlew test` BUILD SUCCESSFUL (getting-started-reactive)
- `./gradlew integrationTest` BUILD SUCCESSFUL (getting-started-reactive)
- `./gradlew quarkusBuild -Dquarkus.container-image.builder=jib -Dquarkus.container-image.build=true` BUILD SUCCESSFUL (getting-started-reactive)
- `./gradlew quarkusBuild -Dquarkus.container-image.builder=jib -Dquarkus.container-image.build=true` BUILD SUCCESSFUL (getting-started-reactive, base image set via gradle.properties to UBI9 OpenJDK 21 `latest`)
- `./gradlew :kafka-streams-quickstart:aggregator:testClasses` BUILD SUCCESSFUL (kafka-streams-quickstart/aggregator)
- `./gradlew :kafka-streams-quickstart:aggregator:test` FAILED (no Docker environment available for Testcontainers)
- `./gradlew :kafka-streams-quickstart:aggregator:quarkusBuild -Dquarkus.container-image.builder=jib -Dquarkus.container-image.build=true -Dquarkus.container-image.name=quarkus-kafka-streams-aggregator -Dquarkus.container-image.tag=latest` BUILD SUCCESSFUL (kafka-streams-quickstart/aggregator)

## Docker Host Access (ubuntu-lan)

- The Docker daemon runs on `ubuntu-lan` and is firewalled.
- Use SSH port forwarding to access container ports from this host.
- Example:
  - Start container on `ubuntu-lan` (port published to host).
  - On this machine, forward a local port:
    - `ssh -N -L 18080:localhost:<HOST_PORT> ubuntu-lan`
  - Test locally:
    - `curl http://localhost:18080/hello`
  - Stop forwarding by terminating the SSH process (Ctrl+C).
