package com.wholeman.first

import Machine
import java.lang.RuntimeException

fun main(args: Array<String>) {
    val myAlmondCupcake = Cupcake.almond()
    val anyMachine = object : Machine<Any> {
        override fun process(product: Any) {
            println(product.toString())
        }
    }
//    anyMachine.process(3)
//    anyMachine.process("")
//    anyMachine.process(myAlmondCupcake)
//    val nullableCupcake: Cupcake? = Cupcake.almond()

//    anyMachine.process(nullableCupcake)
    val nullableCupcake: Cupcake? = Cupcake.almond()
    val length1 = nullableCupcake?.eat()?.length ?: ""
    val length2: Number = nullableCupcake?.eat()?.length ?: 0.0
    anyMachine.process(Unit)

    val result: String = nullableCupcake?.eat() ?: throw RuntimeException()

    val x: Nothing? = null
    val nullsList: List<Nothing?> = listOf(null)

    val myItem = Item(myAlmondCupcake, 0.40, 5)
//    val mySecondItem = myItem.copy(product = myCaramelCupcake)
    val (prod, price, qty) = myItem

    val annotations: List<Annotation> = ElectricOven::class.annotations
    for (annotation in annotations) {
        when (annotation) {
            is Tasty -> println("이것은 맛잇는가? ${annotation.tasty}")
            else -> println(annotation)
        }
    }
}

interface Oven {
    fun process(product: Bakeable)
}

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Tasty(val tasty: Boolean = true)

@Tasty(false)
object ElectricOven : Oven {
    override fun process(product: Bakeable) {
        println(product.bake())
    }
}

//@Tasty
//class CinnamonRoll : Roll("시나몬")

@Tasty interface Fried {
    fun fry(): String
}

data class Item(val product: BakeryGood,
                val unitPrice: Double,
                val quantity: Int)
