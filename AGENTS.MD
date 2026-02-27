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
