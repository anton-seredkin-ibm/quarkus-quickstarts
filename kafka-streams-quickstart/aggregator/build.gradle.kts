plugins {
    java
    id("io.quarkus")
}

dependencies {
    implementation("io.quarkus:quarkus-rest")
    implementation("io.quarkus:quarkus-rest-jackson")
    implementation("io.quarkus:quarkus-kafka-streams")
    testImplementation("io.quarkus:quarkus-junit")
    testImplementation("io.rest-assured:rest-assured")
    testImplementation("org.apache.kafka:kafka-streams-test-utils")
    testImplementation("org.testcontainers:testcontainers-kafka")
}
