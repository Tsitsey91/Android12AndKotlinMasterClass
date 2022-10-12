package com.chris.udemyandroidcourse

// classes are not inheritable by default
// that's why we use the "open" keyword...to make a class inheritable
// we also use "open" to make properties & methods "overridable"

// Super class/ Parent class / Base class
open class Vehicle(val _name: String, var _maxspeed: Int){
    //properties
    open var maxspeed: Int = _maxspeed
    //methods
    fun upgradeSpeed(by: Int){
        this.maxspeed = this.maxspeed + by
        println("maxspeed of ${this._name} is upgraded from ${this.maxspeed-by} to ${this.maxspeed} km/h")
    }
}

//Sub class / Child class / Derived class of "Vehicle"
class Car(_name:String, _maxspeed:Int, _IsRacingCar:Boolean ): Vehicle( _name, _maxspeed){
    //we can override properties & methods of our super class
     override var maxspeed = _maxspeed + 10
}


// now let's use the child class(Car) which inherits the methods & properties of the parent(Vehicle)
fun main(){
    var myCar = Car("Peugeot 307", 150, false)
    myCar.upgradeSpeed(50)

// any class in Kotlin inherits from the "Any" class (just like the "Object" class in Python)
    var object1 : Any
}



