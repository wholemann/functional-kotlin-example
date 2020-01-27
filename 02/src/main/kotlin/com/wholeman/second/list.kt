package com.wholeman.second

import com.wholeman.second.FunList.Cons
import com.wholeman.second.FunList.Nil

sealed class FunList<out T> {
    object Nil : FunList<Nothing>()

    data class Cons<out T>(val head: T, val tail: FunList<T>) : FunList<T>()

    fun forEach(f: (T) -> Unit) {
        tailrec fun go(list: FunList<T>, f: (T) -> Unit) {
            when (list) {
                is Cons -> {
                    f(list.head)
                    go(list.tail, f)
                }
                is Nil -> Unit
            }
        }

        go(this, f)
    }

    fun <R> fold(init: R, f: (R, T) -> R): R {
        tailrec fun go(list: FunList<T>, init: R, f: (R, T) -> R): R = when (list) {
            is Cons -> go(list.tail, f(init, list.head), f)
            is Nil -> init
        }
        return go(this, init, f)
    }

    fun reverse(): FunList<T> = fold(Nil as FunList<T>) { acc, i -> Cons(i, acc) }

    fun <R> foldRight(init: R, f: (R, T) -> R): R {
        return this.reverse().fold(init, f)
    }

    fun <R> map(f: (T) -> R): FunList<R> {
        return foldRight(Nil as FunList<R>) { tail, head -> Cons(f(head), tail) }
    }
}

fun intListOf(vararg numbers: Int): FunList<Int> {
    return if (numbers.isEmpty()) {
        Nil
    } else {
        Cons(numbers.first(), intListOf(*numbers.drop(1).toTypedArray()
                .toIntArray()))
    }
}

fun main(args: Array<String>) {
//    val numbers = Cons(1, Cons(2, Cons(3, Cons(4, Nil))))
    val funList = intListOf(1, 2, 3, 4)
    val list = listOf(1, 2, 3, 4)

//    numbers.forEach { i -> println("i = $i") }
//    val sum = numbers.fold(0) { acc, i -> acc + i }

    println("funList에서 fold 실행: ${executionTime { funList.fold(0) { acc, i -> acc + i } }}")
    println("list에서 fold 실행: ${executionTime { list.fold(0) { acc, i -> acc + i } }}")
    println(funList.map { i -> i * 2 }.forEach { println(it) })

}
