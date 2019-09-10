import classes.*

fun main(args: Array<String>) {

    val listOfVehicles = arrayListOf<Vehicle>(
        Boat(),
        Helicopter(),
        Car(),
        ElectricVehicle(),
        Sailboat(),
        Plane()
    )

    listOfVehicles.forEach {
        it.travel()
    }
}

interface AirTravel {
    fun fly()
}

interface WaterTravel {
    fun sail()
}

interface GroundTravel {
    fun drive()
}