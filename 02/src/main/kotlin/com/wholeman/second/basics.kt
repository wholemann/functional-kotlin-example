package com.wholeman.second

fun f(x: Long): Long {
    return x * x
}

fun main(args: Array<String>) {
    var i = 0

    println(f(5))
    println(f(5))
    println(f(5))

    fun g(x: Long): Long {
        return x * i
    }

    println(g(1))
    i++
    println(g(1))
    i++
    println(g(1))
}
