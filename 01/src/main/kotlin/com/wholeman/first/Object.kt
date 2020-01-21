package com.wholeman.first

//class Outer {
//    val internal = object {
//        val property = ""
//    }
//}

//object Oven {
//    fun process(product: Bakeable) {
//        println(product.bake())
//    }
//}

//interface Oven {
//    fun process(product: Bakeable)
//}

//object ElectricOven : Oven {
//    override fun process(product: Bakeable) {
//        println(product.bake())
//    }
//}

class Cupcake(flavour: String) : BakeryGood(flavour), Bakeable {
    override fun name(): String {
        return "컵케이크"
    }

    companion object Factory {
        fun almond(): Cupcake {
            return Cupcake("아몬드")
        }

        fun cheese(): Cupcake {
            return Cupcake("치즈")
        }
    }
}

//fun main(args: Array<String>) {
//    val expression = object {
//        val property = ""
//        fun method(): Int {
//            println("오브젝트 표현식으로부터")
//            return 42
//        }
//    }
//
//    val i = "${expression.method()} ${expression.property}"
//    println(i)
//
//    val outer = Outer()
//    val myAlmondCupcake = Cupcake("아몬드")
//    Oven.process(myAlmondCupcake)
//    ElectricOven.process(myAlmondCupcake)
//    val myBlueberryCupcake: BakeryGood = Cupcake("블루베리")
//    val myAlmondCupcake = Cupcake.almond()
//    val myCheeseCupcake = Cupcake.cheese()
//    val myCheeseCupcake = myAlmondCupcake.cheese()
//    val myCaramelCupcake = Cupcake("캐러멜")

//    val factory = Cupcake
//}
