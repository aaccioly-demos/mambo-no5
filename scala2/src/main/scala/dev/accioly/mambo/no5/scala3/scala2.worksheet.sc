// SPDX-FileCopyrightText: 2023 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

println("Hello, World! Scala 2 in a worksheet!")

// Fold left
val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
(0 /: l)(_ + _) // (╯°□°）╯︵ ┻━┻

/*// Better way
l.foldLeft(0)(_ + _)
*/

/*// Even better way
l.foldLeft(0)((acc, i) => acc + i)
 */

/*// The way to you should write this
l.sum
 */



