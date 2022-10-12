package com.chris.udemyandroidcourse

/*
abstract classes are a little bit similar to interfaces, but they are still different.
An abstract class cannot be instantiated.
That's the same for interfaces. You cannot create an object of an interface.
However, you can inherit subclasses from an abstract class and the members(properties & methods)
of an abstract class are non abstract unless you explicitly use the abstract keyword.
 */

abstract class Mammal(private val name: String, private val origin:String,
                      private val weight:Double){ // Non Abstract (Concrete) Properties


    //Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed:Double

    //Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    //Non Abstract (Concrete) Methods
    fun displayDetails(){
        println("Name: ${this.name}, Origin: ${this.origin}, Weight: ${this.weight} " +
        "Max Speed: ${this.maxSpeed}")
    }
}


class Human(name: String,origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth and nose")
    }
}

class Elephant(name: String, origin: String,weight: Double,
               override var maxSpeed: Double):Mammal(name, origin, weight){

    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }

}

fun main(){
    val human = Human("Chris", "Greece", 73.0, 25.0)
    val elephant = Elephant("Rosy", "Siberia",5400.0,20.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

    human.displayDetails()
    elephant.displayDetails()
}

/*
So what is the difference between an abstract class and an interface?

1. A class can extend the functionality of multiple interfaces but it can
    inherit only from one (abstract) class.
2. Classes (even abstract classes) have constructors whereas interfaces do not.
3. Interfaces cannot hold fields whereas classes can.

In Summary : Abstract classes can have everything an interface has and, additionaly
            they can have fields and constructors ==> Therefore, we can properly hold state
            in an abstract class.
 */