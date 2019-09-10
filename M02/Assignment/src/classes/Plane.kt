package classes

import AirTravel

class Plane : Vehicle() , AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly() {
        println("The Plane flies with wings.")
    }
}