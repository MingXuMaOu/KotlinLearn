package com.example.kotlinlearn

import android.provider.SyncStateContract
import androidx.appcompat.widget.ThemedSpinnerAdapter
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.math.max


fun main(){
//    val money1 = Money(5)
//    val money2 = Money(10)
//    val money3 = money1 + money2
//    println(money3.value)
//    if("he" in "hello"){
//        println("hello")
//    }
    val str = "abc" * 3
    println(str)
//    doSomething()
//    val count = "ABC123xyz!@#".letterCount()
//    println(count)
//    println("Hello Kotlin")
//    var a = 10
//    a *= 10
//    println("a = " + a)
//    val a = 37
//    val b = 40
//    val value = largerNumber(a,b)
//    println(value)

//    println(getScore("Tomsdfsdf"))
//    checkNumber(66f)
//    for (i in 0 until 10 step 2){
//        println(i)
//    }
//    for (i in 10 downTo 0){
//        println(i)
//    }
//    val p = Person()
//    p.name = "Jack"
//    p.age = 18
//    p.eat()
//    val stu = Student()
//    val stu = Student("Jack",10)
//    stu.readBooks()
//    stu.doHomework()

//    val c1 = Cellphone("Samun",11.22)
//    val c2 = Cellphone("Samun",11.22)
//    println(c1 == c2)

//    Singleton.singleTest()

    val list = listOf("Apple","Banana","Oragne","Pear","Grape")
//    val result = with(StringBuilder()){
//        append("Start eating fruit\n")
//        for (fruit in list){
//            append(fruit).append("\n")
//        }
//        append("Ate all fruits.")
//        toString()
//    }
//    val result = StringBuilder().run {
//        append("Start eating fruit\n")
//        for (fruit in list){
//            append(fruit).append("\n")
//        }
//        append("Ate all fruits.")
//        toString()
//    }
//    val result = StringBuilder().apply {
//        append("Start eating fruit\n")
//        for (fruit in list){
//            append(fruit).append("\n")
//        }
//        append("Ate all fruits.")
//    }
//    println(result.toString())
//    val list = mutableListOf("Apple","Banana","Oragne","Pear","Grape")
//    list.add("Watermelon")
//    for (fruit in list){
//        println(fruit)
//    }

//    val set = setOf("Apple","Banana","Oragne","Pear","Grape")
//    for (fruit in set) {
//        println(fruit)
//    }
//    val map = mapOf("Apple" to 1,"Banana" to 2,"Oragne" to 3,"Pear" to 4,"Grape" to 5)
//    for ((fruit, number) in map) {
//        println("$fruit is $number")
//    }
//    val max = list.maxByOrNull { it.length }
//    println(max)
//    val newList = list.filter { it.length <= 5 }.map { it.uppercase() }
//    for (s in newList) {
//        println(s)
//    }
//    val any = list.any { it.length > 5 }
//    val all = list.all { it.length > 5 }
//
//    println("$any   $all")

//    Thread{
//        println("New Thread")
//    }.start()

//    val student = Student("Tom",19)
//    doStudy()
//    printParams(str = "3sfd3")
    val stu = Student("dsf",0)
}

//fun printParams(num: Int = 99,str: String = "hello"){
//    println("num is $num, str i $str")
//}
//var study: Study? = null
//fun doStudy(){
////    study?.readBooks()
////    study?.doHomework()
//    study?.let {
//        it.readBooks()
//        it.doHomework()
//    }
//}

//fun largerNumber(num1: Int,num2: Int): Int{
//    return max(num1,num2)
//}
//fun largerNumber(num1: Int,num2: Int) = max(num1,num2)
//fun largerNumber(num1: Int,num2: Int): Int{
//    var value = 0
//    if(num1 > num2){
//        value = num1
//    }else{
//        value = num2
//    }
//    return  value
//}
fun largerNumber(num1: Int,num2: Int) = if(num1 > num2) num1 else num2

fun getScore(name: String) = when{
//    "Tom" -> 86
//    "Jim" -> 71
//    "Jack" -> 100
//    else -> 0
    name.startsWith("Tom") -> 88
    name == "Jack" -> 77
    else -> 0
}
//
//fun checkNumber(num: Number){
//    when(num){
//        is Int -> println("Num is Int")
//        is Double -> println("Num is Double")
//        else -> println("Not number")
//    }
//}