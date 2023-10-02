package com.hackerrank.Kotlin.ProblemSolving.WarmUp

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    val total = arr.size
    val plus = arr.filter { a -> a > 0 }.size
    val minus = arr.filter { a -> a < 0 }.size
    val plusRation: Double = plus.toDouble()/total
    val minusRation: Double = minus.toDouble()/total
    val zerosRatio: Double = (total - plus - minus).toDouble()/total
    println(plusRation)
    println(minusRation)
    println(zerosRatio)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
