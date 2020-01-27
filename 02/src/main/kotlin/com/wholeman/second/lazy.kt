package com.wholeman.second

//fun main(args: Array<String>) {
//    val i by lazy {
//        println("느긋한 계산법")
//        1
//    }
//
//    println("i 사용 전")
//    println(i)
//}

//fun main(args: Array<String>) {
//    val size = listOf(2 + 1, 3 * 2, 1 / 0, 5 - 4).size
//}

fun main(args: Array<String>) {
    val size = listOf({ 2 + 1 }, { 3 * 2 }, { 1 / 0 }, { 5 - 4 }).size
}
