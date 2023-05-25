package dev.accioly.mambo.no5.scala3.extensions

extension (s: String)
  def isPalindrome: Boolean = s == s.reverse

@main def testExtensions =
  println("test".isPalindrome)
  println("racecar".isPalindrome)


