plugins {
    id("io.quarkus") apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    dependencies {
        val quarkusPlatformVersion = property("quarkusPlatformVersion") as String
        add("implementation", enforcedPlatform("io.quarkus.platform:quarkus-bom:$quarkusPlatformVersion"))
        add("implementation", "io.quarkus:quarkus-container-image-jib")
    }
}
