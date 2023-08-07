package com.example.hellokotlin

class StarBucks{
    //null 이 가능한 string type 필드
    var lcoation:String? = null
        set(value){//필드에 값을 넣어줄 때 실해오디는 블럭
            //field 는 location 을 카르키고 value 는 넣을 값을 가르킨다
            field=value+"지점"
        }
        get() {
            if(field==null){
                return "지점명 없음"
            }else{
                return field
            }
        }
}

fun main(){
    val s1=StarBucks()
    s1.lcoation="강남"
    println(s1.lcoation)
}