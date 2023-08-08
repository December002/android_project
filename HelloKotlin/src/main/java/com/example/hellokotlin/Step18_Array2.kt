package com.example.hellokotlin

/*
    [java 에서 배열 만드는 방법이 2가지가 있었다]
    정수를 담을 수 있는 방 5개 짜리 배열 만들기
    int[] nums = {0, 0, 0, 0, 0};
    int[] nums = new int[5]
    문자열을 담을 수 있는 방5개 짜리 배열 만들기
    String[] names = {null, null, null, null, null};
    String[] names = new String[5];
 */

fun main(){
    val nums= arrayOf(0,0,0,0,0)
    // Array<T>(방의 size, 초기화 함수)
    val nums2 = Array<Int>(5 ,{0})
    val names = arrayOf<String?>(null,null,null)
    val names3 = Array<String?>(3, {null})

    val msg = arrayOf("","","")
    val msg2 = Array<String>(3,{""})

    val msg3 = Array(100){
        "메세지 $it"
    }

    for(item in msg3){
        println(item)
    }
}