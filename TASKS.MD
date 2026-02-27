# Tasks

- Upgrade the project to use Gradle and Jib.
- Verify `./gradlew testClasses` (getting-started-reactive).
- Verify `./gradlew test` (getting-started-reactive).
- Verify `./gradlew integrationTest` (getting-started-reactive).
- Verify Jib container image build via `./gradlew quarkusBuild -Dquarkus.container-image.builder=jib -Dquarkus.container-image.build=true` (getting-started-reactive).
- Verify Jib container image build with UBI9 OpenJDK 21 base image via `./gradlew quarkusBuild -Dquarkus.container-image.builder=jib -Dquarkus.container-image.build=true -Dquarkus.jib.base-jvm-image=registry.access.redhat.com/ubi9/openjdk-21-runtime:1.24 -Dquarkus.container-image.name=quarkus-getting-started-reactive -Dquarkus.container-image.tag=local` (getting-started-reactive).
- Verify Jib container image build with UBI9 OpenJDK 21 base image via gradle.properties (`systemProp.quarkus.jib.base-jvm-image=registry.access.redhat.com/ubi9/openjdk-21-runtime:latest`) and `./gradlew quarkusBuild -Dquarkus.container-image.builder=jib -Dquarkus.container-image.build=true -Dquarkus.container-image.name=quarkus-getting-started-reactive` (getting-started-reactive).
