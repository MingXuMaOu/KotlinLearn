package com.example.kotlinlearn

class Money(val value: Int) {
    operator fun plus(money: Money): Money{
        val sum = value + money.value
        return Money(sum)
    }
}