package com.hackerrank.Kotlin.ProblemSolving.Sorting

/*
 * Complete the 'insertionSort1' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY arr
 */

fun insertionSort1(n: Int, arr: Array<Int>): Unit {
    val unsortedElement = arr[n - 1]
    var i = n - 2

    while (i >= 0 && arr[i] > unsortedElement) {
        arr[i + 1] = arr[i]
        println(arr.joinToString(" "))
        i--
    }

    arr[i + 1] = unsortedElement
    println(arr.joinToString(" "))
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    insertionSort1(n, arr)
}
