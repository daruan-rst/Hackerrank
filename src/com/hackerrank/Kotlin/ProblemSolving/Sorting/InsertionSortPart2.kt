package com.hackerrank.Kotlin.ProblemSolving.Sorting

/*
 * Complete the 'insertionSort1' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY arr
 */

fun insertionSort2(n: Int, arr: Array<Int>): Unit {
    for (i in 1 until n){
        val k = arr[i]
        var j = i-1

        while (j >= 0 && arr[j] > k){
            arr[j+1] = arr[j]
        }

        arr[j+1] = k

        println(arr.joinToString(" "))
    }
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    insertionSort1(n, arr)
}
