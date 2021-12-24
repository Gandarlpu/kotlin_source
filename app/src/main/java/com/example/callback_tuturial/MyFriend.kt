package com.example.callback_tuturial

// 클래스 이름 : 내 친구
class MyFriend {

    // 멤버 변수
    // 이름
    var name : String? = null

    // 나이
    var age : Int? = null

    // 결혼 여부
    var isMarried : Boolean? = null

    // 별명
    var nickname : String? = null

    // init = 기본 생성자
    // 메모리에 올릴 때 init에서 값을 설정해 줄 수 있다.
    init {
        name = "길동이"
        age = 20
        isMarried = false
        nickname = "끼욧싀"
    }


}