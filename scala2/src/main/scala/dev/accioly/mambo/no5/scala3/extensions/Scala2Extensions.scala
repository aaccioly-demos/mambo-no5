// SPDX-FileCopyrightText: 2023 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.mambo.no5.scala3.extensions

object Scala2Extensions {

  implicit class StringImprovements(s: String)  {
    def isPalindrome: Boolean = s == s.reverse
  }

  def main(args: Array[String]): Unit = {
    println("abba".isPalindrome)
    println("scala2".isPalindrome)
  }

}
