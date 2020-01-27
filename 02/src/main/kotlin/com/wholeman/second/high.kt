package com.wholeman.second

val capitalize = { str: String -> str.capitalize() }
//val capitalize = object : Function1<String, String> {
//    override fun invoke(p1: String): String {
//        return p1.capitalize()
//    }
//}

fun <T> transform(t: T, fn: (T) -> T): T {
    return fn(t)
}

fun reverse(str: String): String {
    return str.reversed()
}

object MyUtils {
    fun doNothing(str: String): String {
        return str
    }
}

class Transformer {
    fun upperCased(str: String): String {
        return str.toUpperCase()
    }

    companion object {
        fun lowerCased(str: String): String {
            return str.toLowerCase()
        }
    }
}

fun unless(condition: Boolean, block: () -> Unit) {
    if (!condition) block()
}

//interface Machine<T> {
//    fun process(product: T)
//}
//
//fun <T> useMachine(t: T, machine: Machine<T>) {
//    machine.process(t)
//}
//
//class PrintMachine<T> : Machine<T> {
//    override fun process(t: T) {
//        println(t)
//    }
//}

typealias Machine<T> = (T) -> Unit

fun <T> useMachine(t: T, machine: Machine<T>) {
    machine(t)
}

class PrintMachine<T> : Machine<T> {
    override fun invoke(p1: T) {
        println(p1)
    }
}

fun main(args: Array<String>) {
//    println(capitalize("헬로 월드!"))
    println(transform("kotlin", capitalize))
    println(transform("kotlin", ::reverse))
    println(transform("kotlin", MyUtils::doNothing))
    val transformer = Transformer()
    println(transform("kotlin", transformer::upperCased))
    println(transform("kotlin", Transformer.Companion::lowerCased))
    println(transform("kotlin", { it.substring(0..1) }))
    println(transform("kotlin") { it.substring(0..1) })

    val securityCheck = false
    unless(securityCheck) {
        println("이 웹사이트에 접근할 수 없다")
    }

//    useMachine(5, PrintMachine())
//    useMachine(5, object : Machine<Int> {
//        override fun process(t: Int) {
//            println(t)
//        }
//    })
    useMachine(5, PrintMachine())
    useMachine(5, ::println)
    useMachine(5, { i -> println(i) })
}
