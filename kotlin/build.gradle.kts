plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.8.21"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Needed for the worksheet
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.8.21")
}

kotlin {
    jvmToolchain(17)
}

application {
    // Define the main class for the application.
    mainClass.set("dev.accioly.mambo.no5.kotlin.main.KotlinMainKt")
}
