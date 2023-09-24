package com.hackerrank.Kotlin.Strings.JavaSubstring


fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        val s = readln()
        val startEnd = readln()
        var start: Int = Integer.valueOf(startEnd.split(" ")[0])
        var end:Int = Integer.valueOf(startEnd.split(" ")[1])
        println(s.subSequence(start, end))
    }
