// SPDX-FileCopyrightText: 2023 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.mambo.no5.kotlin.extensions

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    println("Is 'mom' a palindrome? ${"mom".isPalindrome()}")
    println("Is 'sun' a palindrome? ${"sun".isPalindrome()}")
}
