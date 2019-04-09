

//WAP to create sealed Base class and 3 subclasses of Base class, write a function which will have base class object as an argument and it will return name of the subclass based argument type.

sealed class Vehicle{
    open var tyres=0
}

class Bike:Vehicle(){
    override var tyres=2
}
class Car:Vehicle(){
    override var tyres=4
}

fun main(){
    println(Bike())
    println(Car())
}