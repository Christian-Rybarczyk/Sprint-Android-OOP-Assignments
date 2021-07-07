package classes

import WaterTravel

class Boat : Vehicle(), WaterTravel {
    override fun travel() {
        sail()
    }

    override fun sail() {
        println("The Boat moves with a motor.")
    }
}