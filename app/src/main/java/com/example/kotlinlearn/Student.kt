package com.example.kotlinlearn

class Student(val sno: String = "",val grade: Int = 0,name: String = "",age: Int = 0): Person(name,age){
//    constructor(name: String,age: Int): super(name,age) {
//
//    }

//    override fun readBooks() {
//        println("$name is reading")
//    }

//    override fun doHomework() {
//        println("$name is doing homework")
//    }
//    constructor(name: String,age: Int): this("",10,name,age){}
//    constructor(): this("",0){
//        println("无参数")
//    }
//
//    init {
//        println("sno is $sno")
//        println("grade is $grade")
//        println("name is $name")
}