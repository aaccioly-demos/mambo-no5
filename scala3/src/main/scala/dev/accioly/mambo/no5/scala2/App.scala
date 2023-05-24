package dev.accioly.mambo.no5.scala2

// scala 3 main
@main def hello(): Unit =
  println("Hello world!")
  println("Hello world!".isPalindrome)

// extend String class with isPalindrome method
extension (s: String)
  def isPalindrome: Boolean = s == s.reverse
