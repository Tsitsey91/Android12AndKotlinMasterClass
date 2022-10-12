package com.chris.udemyandroidcourse

// Interfaces allow us to extend the functionality of classes
/*
So what is an interface?
Well, an interface is essentially a contract that a class may choose to sign.
If it does, the class is obliged to provide implementations of the properties and functions of the
interface.
*/
interface Drivable{
    val maxspeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// the "Car7" class extends the functionality of the "Drivable" interface
// that's why it need to implement the property "maxspeed" that is created
// in the interface BUT is NOT implemented in there...
// ... and the function "drive()" because it does not have the same structure as the "drive()"
// of the Car7 class...
open class Car7(override val maxspeed:Double,
                val name: String, var brand: String): Drivable{
    //properties
    open var range: Double = 0.0

    //methods
    fun extendRange(amount: Double){
        if (amount>0)
            range += amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }

    // extending the interface's "drive()"
    // override func drive(): String = "This is returned by the overriding of the interface's drive() function"
    override fun drive(): String {
        return "This is returned by the overriding of the interface's drive() function"
    }
}


//sub class of Car7
class ElectricCar7(maxspeed: Double, name: String, brand: String, batteryLife: Double)
    : Car7(maxspeed, name, brand ){
    var chargerType = "Type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on Electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on Electricity"
    }
}

fun main(){
    var audi3 = Car7(200.0,"A3","Audi")
    var TeslaS = ElectricCar7(250.0,"S-Model","Tesla",100.0)

    TeslaS.brake() //from interface
    println(TeslaS.drive())  //$range = 100 * 6
    TeslaS.drive(200.0) // $distance = 200
    audi3.brake() //from interface

}

/*
So why would you even use interfaces?
Well, interfaces are super useful when you have certain functions in mind that you definitely want
to be implemented later on.
And also already know the properties of of a class that you want them to have implemented, but you
don't want to implement them directly.
You just want to prepare everything and you don't want to, for example, create a specific body already
for a function.
*/