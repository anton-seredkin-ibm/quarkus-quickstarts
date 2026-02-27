plugins {
    java
    id("io.quarkus")
}

dependencies {
    implementation("io.quarkus:quarkus-rest")
    testImplementation("io.quarkus:quarkus-junit")
    testImplementation("io.rest-assured:rest-assured")
}

quarkus {
    containerImage {
        baseImage = "registry.access.redhat.com/ubi9/openjdk-21-runtime:1.24"
    }
}
