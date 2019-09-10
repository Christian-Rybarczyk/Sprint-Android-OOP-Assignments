package classes

import GroundTravel

class ElectricVehicle : Vehicle(), GroundTravel {
    override fun travel() {
        drive()
    }

    override fun drive() {
        println("The Electric vehicle drives with battery power.")
    }
}