package com.wholeman.first

interface Exotic {
    fun isExotic(): Boolean
}

enum class Flour : Exotic {
    WHEAT {
        override fun isGlutenFree(): Boolean {
            return false
        }

        override fun isExotic(): Boolean {
            return false
        }
    },
    CORN {
        override fun isGlutenFree(): Boolean {
            return true
        }

        override fun isExotic(): Boolean {
            return false
        }
    },
    CASSAVA {
        override fun isGlutenFree(): Boolean {
            return true
        }

        override fun isExotic(): Boolean {
            return true
        }
    };

    abstract fun isGlutenFree(): Boolean
}

fun flourDescription(flour: Flour): String {
    return when(flour) {
        Flour.CASSAVA -> "매우 이국적인 맛"
        else -> "지루함"
    }
}
