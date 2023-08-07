package com.example.hellokotlin

import java.util.Scanner

fun main(){
    val scan=Scanner(System.`in`)
    println("Gun:1, Sword:2")
    print("무기를 선택하세요(1 or 2):")
    val weapon=scan.nextInt()
    when(weapon){
        1->println("총으로 공격해요")
        2-> println("칼로 공격해요")
        else-> println("주먹으로 공격해요")
    }

    // when 구문도 리턴값을 가질 수 있다
    val selectedWeapon=when(weapon){
        1->{
            //실행할 구문이 많다면 블럭으로도 구성할 수 있다
            println("총 장전중...")
            "총"
        }
        2->"칼"
        else->"주먹"
    }

    println("선택한 무기 : $selectedWeapon")
}