package com.example.kotlinlearn

 fun String.letterCount(): Int{
    var count = 0
    for (char in this){
        if(char.isLetter()){
            count++
        }
    }
    return count
}

operator fun String.times(n: Int): String{
    val builder = StringBuilder()
    repeat(n){
        builder.append(this)
    }
    return builder.toString()
}