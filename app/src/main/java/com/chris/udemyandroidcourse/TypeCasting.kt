package com.chris.udemyandroidcourse

import kotlin.math.floor

fun main(){

    val myStringList: List<String> = listOf(
        "Denis", "Chris", "Frank", "Garry")

    val myMixedList: List<Any> = listOf(
        "Denis", 31, 5, "BDay", 80.12, "weights", "Kg")


    for(value in myMixedList) {
        if (value is Int){
            println("Integer: $value")
        } else if (value is Double){
            println("Double: $value with Floor value ${floor(value)}")
        } else if (value is String){
            println("String: $value of length ${value.length}")
        } else {
            println("Unknown Type")
        }
    }

    //Alternatively
    for (value in myMixedList){
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    // SMART CAST
    val obj1: Any = "I have a dream"
    if (obj1 !is String){
        println("Not a String")
    } else {
        // obj1 is automatically casted into a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    // Explicit - UNSAFE Casting (using the "as" keyword) - CAN GO WRONG
    val str1: String = obj1 as String
    println(str1.length)

    //val obj2: Any = 1337
    //val str2: String = obj2 as String // ERROR since obj2 is NOT a String
    //println(str2)

    // EXPLICIT - SAFE Casting (using the "as?" keyword)
    val obj3: Any = 1337
    val str3: String? = obj3 as? String // Works
    println(str3) //Prints null if it does not find a String
}