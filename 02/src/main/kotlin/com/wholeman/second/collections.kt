package com.wholeman.second

val numbers: List<Int> = listOf(1, 2, 3, 4)

//fun main(args: Array<String>) {
//    for (i in numbers) {
//        println("i = $i")
//    }
//}

fun main(args: Array<String>) {
//    numbers.forEach { i -> println("i = $i") }
//    val numbersTwice: MutableList<Int> = mutableListOf()
    val numbersTwice: List<Int> = numbers.map { i -> i * 2}
//    for (i in numbers) {
//        numbersTwice.add(i * 2)
//    }
//    var sum = numbers.fold(0) { acc, i -> acc + i }
    var sum = numbers.fold(0) { acc, i ->
        println("acc, i = $acc, $i")
        acc + i
    }
    println(sum)
}
