println("Hello, World! In a Kotlin worksheet!")

// Fold left
val l = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
l.fold(0) {acc, i -> acc + i }
l.sum()
