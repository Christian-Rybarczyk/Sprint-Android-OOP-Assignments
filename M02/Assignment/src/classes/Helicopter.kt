package classes

import AirTravel

class Helicopter : Vehicle(), AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly() {
        println("The Helicopter flies with rotors.")
    }
}