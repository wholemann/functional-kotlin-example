package com.wholeman.first

//class VeryBasic

//class BlueberryCupcake {
//    val flavour = "블루베리"
//}

//class AlmondCupcake {
//    val flavour = "아몬드"
//}

abstract class BakeryGood(val flavour: String) {
    init {
        println("새로운 베이커리 제품 준비중")
    }

    fun eat(): String {
        return "냠냠냠, 맛있는 $flavour ${name()}"
    }

    abstract fun name(): String
}

interface Bakeable {
    fun bake(): String {
        return "여기는 뜨겁다. 그렇지??"
    }
}

//class Cupcake(flavour: String) : BakeryGood(flavour), Bakeable {
//    override fun name(): String {
//        return "컵케이크"
//    }
//}

//class Biscuit(flavour: String) : BakeryGood(flavour) {
//    override fun name(): String {
//        return "비스킷"
//    }
//}

//open class Roll(flavour: String) : BakeryGood(flavour) {
//    override fun name(): String {
//        return "롤"
//    }
//}

//class CinnamonRoll : Roll("시나몬")

//interface Fried {
//    fun fry(): String
//}

//open class Donut(flavour: String, val topping: String) : BakeryGood(flavour), Fried {
//    override fun fry(): String {
//        return "*기름에서 수영하기*"
//    }
//
//    override fun name(): String {
//        return "$topping(으)로 토핑된 도넛"
//    }
//}

//class Customer(val name: String) {
//    fun eats(food: BakeryGood) {
//        println("$name 이(가) ${food.eat()} 을(를) 먹는다.")
//    }
//}

//fun main(args: Array<String>) {
////    val myDonut = Donut("커스터드", "파우더 슈거")
//    val mario = Customer("마리오")
//    val food: BakeryGood = object : BakeryGood("TEST_1") {
//        override fun name(): String {
//            return "TEST_2"
//        }
//    }
//    val somethingFried = object : Fried {
//        override fun fry(): String {
//            return "TEST_3"
//        }
//    }
//    mario.eats(food)
//}
