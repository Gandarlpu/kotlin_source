package com.example.kolin_base.Kolin.kotlin

//과제
//Night , Monster(부모) -> character
//SuperNight , SuperMonster(자식)

fun main(){

    val monster = SuperMonster(100 , 10)
    val night = SuperNight(130 , 8)
    monster.attack(night)
    monster.bite(night)

}
//상속이 만들어낸 특징
//- 자식 클래스는 부모 클래스의 타입이다.
//super몬스터도 결국 charactor다
//거꾸로는 성립이 안됨.
//부모 클래스는 자식 클래스의 타입이 아니다.

open class Charactor(var hp: Int , val power: Int){

    fun attack(charactor : Charactor , power: Int = this.power){ //fun attack에 있는 power를 사용하는게 아니라 Charactor의 power를 사용하고 싶을 때 this.power사용
        charactor.defense(power)
    }

    open fun defense(damage : Int){
        hp -= damage
        if(hp > 0){
            println("현재 체력은 $hp 입니다.")
        }else{
            println("죽었습니다.")
        }

    }

}

class SuperNight(hp: Int , power: Int) : Charactor(hp  , power){
    fun bite(charactor: Charactor){
        super.attack(charactor , power+2)
    }
}

//자식 클래스가 인터스턴스화 되기 위해서는 부모 클래스가 선행되서 인스턴스화 되어야 한다.
class SuperMonster(hp: Int , power: Int) : Charactor(hp , power) {
//자식 클래스는 파라미터의 var , val를 붙이면 안된다.
//이미 부모 클래스에 선언되어 있기 때문

    fun bite(charactor: Charactor){
        super.attack(charactor , power+2)
    }

}
