package com.parveztest.coroutinesandextensionfunctions

fun String.removeFirstChar(): String = this.substring(1,this.length)

fun main() {
    val myString = "Hello"
    println("String after remove first char is ${myString.removeFirstChar()}")
}

//class Circle (val radius: Double) {
//    fun area(): Double {
//        return Math.PI * radius * radius
//    }
//}
//
//fun main() {
//    fun Circle.permeter(): Double {
//        return 2*Math.PI*radius
//    }
//    val circle = Circle(2.5)
//    println("Area of a circle is ${circle.area()}")
//    println("Permeter of a circle is ${circle.permeter()}")
//}