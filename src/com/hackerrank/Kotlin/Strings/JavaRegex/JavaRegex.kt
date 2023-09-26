package com.hackerrank.Kotlin.Strings.JavaRegex

import java.util.*

fun main(args: Array<String>) {
    val scanner: Scanner = Scanner(System.`in`)
    val regex = MyRegex.PATTERN.toRegex()
    while(scanner.hasNext()){
        val IP = scanner.next()
        println(regex.matches(IP))
    }
}

class MyRegex{
    companion object {
        const val PATTERN: String =
                """
                (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}
                """
    }
}
