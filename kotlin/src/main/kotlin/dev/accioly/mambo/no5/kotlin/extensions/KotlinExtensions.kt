package dev.accioly.mambo.no5.kotlin.extensions

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    println("Is 'mom' a palindrome? ${"mom".isPalindrome()}")
    println("Is 'sun' a palindrome? ${"sun".isPalindrome()}")
}
