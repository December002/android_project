package com.example.hellokotlin

/*
    kotlin 에서의 배열과 반복문
 */
fun main() {
    //수정 불가능한 목록(list)
    val names: List<String> = listOf<String>("kim", "lee", "park")
    //상수의 type 이 추론 가능하기 때문에 생략 가능
    val animals = listOf<String>("dog", "cat", "elephant")
    //listof( ) 안에 있는 데이터가 추론 가능 하기 때문에 listOf 의 Generic 도 생략 가능
    val nums = listOf<Int>(10, 20, 30)

    //배열의 참조
    println(names[0])
    println(names[1])
    println(names[2])

    //수정 불가
    //names[0]="김구라"

    //indices 는 index의 복수형 ( names 배열의 index 로 이루어진 배열 )
    val result = names.indices

    for (i in names.indices) {
        println(i)
    }
    println("-----------")
    for (i in names.indices) {
        println(names[i])
    }
    println("-----------")
    for (i in names.indices) {
        println("$i : $names[i]")
    }
    println("-----------")
    for (item in names) {
        println(item)
    }
    println("-----------")
    names.forEach {
        println(it)
    }
}