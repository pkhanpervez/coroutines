package com.parveztest.coroutinesandextensionfunctions

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Programs starts ${Thread.currentThread().name}")
        val jobDef = async {
                println("async block start")
                println("Programs starts ${Thread.currentThread().name}")
                delay(1000)
                println("Programs starts ${Thread.currentThread().name}")
                15
            }

        val numResult = jobDef.await()
        println("Result: $numResult")
    }
}