package com.rybarstudios.interfaces.model

abstract class Vehicle(val id: String, val weight: Int, var favorite: Boolean) {
    abstract fun travel()
}

class Boat(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {
    override fun travel() {
        sail()
    }

    override fun sail(): String {
        return "The $id moves with a motor."
    }
}

class Car(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), GroundTravel {
    override fun travel() {
        drive()
    }

    override fun drive(): String {
        return "The $id drives with gas."
    }
}

class ElectricVehicle(id: String, weight: Int, favorite: Boolean) : Vehicle(id,weight, favorite), GroundTravel {
    override fun travel() {
        drive()
    }

    override fun drive(): String {
        return "The $id drives with battery power."
    }
}

class Helicopter(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly(): String {
        return "The $id flies with rotors."
    }
}

class Sailboat(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {
    override fun travel() {
        sail()
    }

    override fun sail(): String {
        return "The $id moves with sails."
    }
}

class Plane(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite) , AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly(): String {
        return "The $id travels via wings."
    }
}

interface AirTravel {
    fun fly(): String
}

interface WaterTravel {
    fun sail(): String
}

interface GroundTravel {
    fun drive(): String
}

object VehicleList val vehicleList: ArrayList<Vehicle> = arrayListOf(
    Plane("Airplane",
        90000,
        true),
    Boat("Boat",
        40000,
        false),
    Sailboat("Sailboat",
        12500,
        false),
    Car("Car",
        8000,
        true),
    ElectricVehicle("Tesla",
        5200,
        true),
    Helicopter("Helicopter",
        17000,
        false)
)