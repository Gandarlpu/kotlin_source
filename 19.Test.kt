package com.example.kolin_base.Kolin.kotlin

import android.bluetooth.BluetoothA2dp
import java.lang.reflect.Array.get


// 1) 사칙연산 수행 클래스
/*

2) 은행 계좌 만들기
    - 계좌 생성 기능 (이름 , 생년월일)
    - 잔고를 확인하는 기능
    - 출금 기능
    - 예금 기능

3) TV클래스
    - on/off기능
    - 채널을 돌리는 기능
    - 초기 채널은 (S사 M사 K사 3개)

*/


fun main(array : Array<String>){


    first(1,2)
    println()
    var problem2 = two("박찬수" , 951006)
    problem2.input(10000)
    problem2.money()
    problem2.output(5000)
    problem2.money()

    val tv = TV(listOf<String>("K","M","S"))
    tv.switch()
    println(tv.onOrOff)

    tv.channelUp()
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.currentChannelNumber //get()에서 감지

}

class TV(val channels : List<String>){

    var onOrOff : Boolean = false //True -> On , False -> off
    var currentChannelNumber = 0
    //2보다 크게되면 다시 0으로 돌려 인덱스 에러가 나지 않게 한다.
        //set함수는 currentChannelNumber의 변화를 볼 수 있음
        set(value) {
            //value는 currentCahnnelNumber에 value를 할당할 때 사용
            //그러면 이렇게 연결해줘서 value에 감지되게 해야되는데 currentChannelNumber = value 를 쓰면 무한루프에 빠짐
            //왜냐면 할당할때 감지되서 계속해서 set함수를 실행
            field = value
            //그럴 때 field를 사용
            if(field > 2){
                field = 0
            }
            if(field < 0){
                field = 2
            }

            println(value)
        }
        get(){
            //변수가 불려나갈 때 호출
            //불려나간다는것은 반환

            println("호출되었습니다.")
            return field + 1
        }

    fun switch(){

        onOrOff = !onOrOff

    }

    fun channelUp(){
        currentChannelNumber = currentChannelNumber + 1
        /*channels.forEachIndexed{ index, value ->
            if(currentChannelNumber == index){
                currentChannelNumber = currentChannelNumber + 1
                return
            }
        }*/
    }

    fun checkCurrentChannel() : String{
        return channels[currentChannelNumber]
    }

    fun channelDown(){
        currentChannelNumber = currentChannelNumber - 1
        /*channels.forEachIndexed{ index , value ->
            if(currentChannelNumber == index){
                currentChannelNumber = currentChannelNumber - 1
                return
            }
        }*/
    }

}

/*

class tv(var a1 : String){

    var control = a1

    fun turn(control : String){

        if(control == "on"){
            println("tv가 켜졌습니다.")


        }else if(control == "off"){
            println("tv가 꺼졌습니다.")
        }

    }
}
*/

class two(var a1 : String , var a2 : Int){

    var name = a1
    var birthday = a2
    var last_money = 0

    //잔고확인
    //입,출금하면 계속 바뀌어야함
    fun money(){

        if(name == "박찬수" && birthday == 951006){
            println("잔고는 : " + last_money + "가 남았습니다.")
        }
    }

    //입금
    fun input(input_money : Int){
        if(name == "박찬수" && birthday == 951006){
            last_money += input_money
            println("입금완료" + last_money)
        }
    }

    //출금
    fun output(output_money : Int){
        if(name == "박찬수" && birthday == 951006){
            last_money -= output_money
            println("출금 완료 : " + last_money)
        }
    }


}

class first(var num1 : Int , var num2 : Int){

    val a1 : Int = num1
    val a2 : Int = num2

    init {
        println("더하기 : " + (a1+a2))
        println("빼기 : " + (a1-a2))
        println("곱하기 : " + (a1*a2))
        println("나누기 : " + (a1/a2))

    }

}