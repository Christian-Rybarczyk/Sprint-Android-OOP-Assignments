package classes

import GroundTravel

class Car : Vehicle(), GroundTravel {
    override fun travel() {
        drive()
    }

    override fun drive() {
        println("The Car drives with gas.")
    }
}