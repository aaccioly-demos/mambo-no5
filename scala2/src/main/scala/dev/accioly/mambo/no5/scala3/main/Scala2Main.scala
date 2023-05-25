package dev.accioly.mambo.no5.scala3.main

object Scala2Main {
  def main(args: Array[String]): Unit = {
    println("Hello, World! From Scala 2!")
  }

  // extend String class with isPalindrome method
  implicit class StringImprovements(s: String) {
    def isPalindrome: Boolean = s == s.reverse
  }

}
