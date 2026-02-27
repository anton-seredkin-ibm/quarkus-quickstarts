# Tasks

- Upgrade the project to use Gradle and Jib.
- Verify `./gradlew :getting-started-reactive:test` (ITs excluded from `test`).
- Verify `./gradlew :kafka-streams-quickstart:aggregator:testClasses` (compilation).
- Verify Jib container image build via `./gradlew :getting-started-reactive:quarkusBuild :kafka-streams-quickstart:aggregator:quarkusBuild -Dquarkus.container-image.builder=jib -Dquarkus.container-image.build=true -Dquarkus.container-image.push=false`.
