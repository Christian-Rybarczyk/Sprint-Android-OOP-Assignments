package classes

import WaterTravel

class Sailboat : Vehicle(), WaterTravel {
    override fun travel() {
        sail()
    }

    override fun sail() {
        println("The Sailboat moves with sails.")
    }
}