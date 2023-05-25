package dev.accioly.mambo.no5.scala3.main

// scala 3 main
@main def hello(): Unit =
  println("Hello, World! From Scala 3!")
//println("Hello world!".isPalindrome)

// extend String class with isPalindrome method
extension (s: String)
  def isPalindrome: Boolean = s == s.reverse
