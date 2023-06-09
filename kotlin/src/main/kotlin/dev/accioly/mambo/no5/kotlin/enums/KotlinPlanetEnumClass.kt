// SPDX-FileCopyrightText: 2023 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.mambo.no5.kotlin.enums

import dev.accioly.mambo.no5.kotlin.enums.KotlinPlanetEnumClass.*

const val G = 6.67300E-11

enum class KotlinPlanetEnumClass(
    val mass: Double, // in kilograms
    val radius: Double // in meters
) {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    fun surfaceGravity(): Double {
        return G * mass / (radius * radius)
    }

    fun surfaceWeight(otherMass: Double): Double {
        return otherMass * surfaceGravity()
    }

}

fun main(args: Array<String>) {
    val earthWeight = args[0].toDouble()
    val mass: Double = earthWeight / EARTH.surfaceGravity()
    for (p in KotlinPlanetEnumClass.values()) {
        println("Your weight on ${p.name} is ${p.surfaceWeight(mass)}")
    }
}


