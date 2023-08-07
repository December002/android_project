package com.example.hellokotlin

fun main(){
    //수정 가능한 Map
    val mem:MutableMap<String, Any> = mutableMapOf<String, Any>()
    //Map 에 데이터 넣는 방법 1
    mem.put("num", 1)
    mem.put("name", "김구라")
    mem.put("isMam", true)

    //수정 가능한 Map2
    val mem2:MutableMap<String, Any> = mutableMapOf<String, Any>()
    //Map 에 데이터 넣는 방법 1
    mem2["num"]=2
    mem2["name"]="원숭이"
    mem2["isMan"]=true
    //Mutable 이기 때문에 수정가능
    mem

}