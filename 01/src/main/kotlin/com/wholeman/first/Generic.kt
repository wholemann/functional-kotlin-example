//package com.wholeman.first
//
//interface Oven {
//    fun process(product: Bakeable)
//}
//
interface Machine<T> {
    fun process(product: T)
}
//
//interface Oven: Machine<Bakeable>
//
//typealias Oven = Machine<Bakeable>
//
//typealias Flavour = String
//
//abstract class BakeryGood(val flavour: Flavour) {
//
//}
//
//typealias OvenTray = List<Bakeable>
//typealias CupcakeFactory = Cupcake
//
//fun main(args: Array<String>) {
//    val cupcake: Cupcake = Cupcake.almond()
//    val nullableCupcake: Cupcake? = Cupcake.almond()
//    cupcake.eat()
//
//    if (nullableCupcake != null) {
//        nullableCupcake.eat()
//    }
//
//    if (nullableCupcake is Cupcake) {
//        nullableCupcake.eat()
//    }
//
//    when (nullableCupcake) {
//        is Cupcake -> nullableCupcake.eat()
//    }
//
//    nullableCupcake?.eat()
//
//    val result: String? = nullableCupcake?.eat()
//    val length: Int? = nullableCupcake?.eat()?.length
//
//    val result2: String = nullableCupcake?.eat() ?: ""
//    val length2: Int? = nullableCupcake?.eat()?.length ?: 0
//
//    val result3: String = nullableCupcake!!.eat()
//    val length3: Int = nullableCupcake.eat().length
//}
