package dev.accioly.mambo.no5.scala2

object App {
  def main(args: Array[String]): Unit = {
    println(greeting())
    println("abba".isPalindrome)
  }

  def greeting(): String = "Hello, world!"

  // extend String class with isPalindrome method
  implicit class StringImprovements(s: String) {
    def isPalindrome: Boolean = s == s.reverse
  }

}
