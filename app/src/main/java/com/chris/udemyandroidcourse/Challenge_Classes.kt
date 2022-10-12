package com.chris.udemyandroidcourse

fun main(){
//    val iphone = MobilePhone("iOS", "Apple", "iPhone 4")
//    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
//    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
    val xiaomi = MobilePhone("Android", "Xiaomi","RedMi Note 10")
    xiaomi.chargeBattery(30)
}


class MobilePhone constructor(osName: String, brand: String, model: String){
    var battery : Byte = 45

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(howMuchToCharge: Byte){
        println("Battery was at ${this.battery}%")
        println("battery charging by $howMuchToCharge% . . .")
        Thread.sleep(3_000)  // wait for 3 second
        this.battery = (this.battery + howMuchToCharge).toByte()
        println("Success: Battery is now at ${this.battery}%")
    }
}