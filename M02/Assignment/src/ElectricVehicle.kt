class ElectricVehicle : Vehicle(), GroundTravel {
    override fun travel() {
        drive()
    }

    override fun drive() {
        val name: String = javaClass.toString().replace("class", "")
        println("The$name drives with battery power.")
    }
}