// SPDX-FileCopyrightText: 2023 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

plugins {
    // Apply the scala Plugin to add support for Scala.
    scala

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use Scala 3.2.2 in our library project
    implementation("org.scala-lang:scala3-library_3:3.2.2")
}

application {
    // Define the main class for the application.
    mainClass.set("dev.accioly.mambo.no5.scala3.main.hello")
}
