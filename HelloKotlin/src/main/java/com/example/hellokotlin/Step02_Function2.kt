package com.example.hellokotlin

//함수 type 을 매개 변수로 전달받는 함수를 정의 하고자 한다.
fun useFunc(a:()->Unit){
    //인자로 전달 받은 함수 호출하기
    a()
}

fun main(){
    //위의 useFunc() 함수를 호출해 보세요
    useFunc(fun(){
        println("오잉?")
    })

    // fun() 생략 가능
    useFunc({
        println("슈발?")
    })

    // 함수 호출하는 표현식 ( ) 생략 가능
    useFunc {
        println("이게뭐노..")
    }
    // Read Only 숫자 배열
    var nums:List<Int> = listOf(100 ,200, 300)

    nums.forEach(fun(item){
            println(item)
    })

    nums.forEach({
        // it 은 매개변수에 전달되는 바로 그것(it) 을 가리킨다
        println(it)
    })

    nums.forEach{
        // it 은 매개변수에 전달되는 바로 그것(it) 을 가리킨다
        println(it)
    }
}