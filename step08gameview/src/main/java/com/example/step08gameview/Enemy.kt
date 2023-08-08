package com.example.step08gameview

data class Enemy(
    var x:Int=0, // x좌표
    var y:Int=0, // y 좌표
    var type:Int=0, // 적기의 type 0 sivler, 1 은 gold
    var isDead:Boolean=false, //화면에서 제거할지 여부
    var energy:Int=0, // 에너지
    var imageIndex:Int=0, // 적기의 이미지 인덱스

)