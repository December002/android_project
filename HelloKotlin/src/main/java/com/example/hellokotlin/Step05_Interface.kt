package com.example.hellokotlin

// kotlin 에서 인터페이스 만들기
interface Remocon{
    fun up()
    fun down()
}
//인터페이스를 구현한 클래스 만들기
class MyRemocon : Remocon{
    override fun up() {
        TODO("Not yet implemented")
    }

    override fun down() {
        TODO("Not yet implemented")
    }

}

fun main (){
    val r1=MyRemocon()
    r1.up()
    r1.down()
    /*
        in java

        Remocon r =new Remcon(){
            @override
            public void up(){}
            @override
            public void down(){}
        }
        in kotlin
     */
    // 클래스를 정의함 과 동시에 객체를 생성하는 것이 object 키워드 이다
    val r2:Remocon = object : Remocon{
        override fun up() {
            println("채널을 올려요")
        }

        override fun down() {
            println("채널을 내려요")
        }
    }
    r2.up()
    r2.down()
}