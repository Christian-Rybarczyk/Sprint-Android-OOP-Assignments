class ElectricVehicle : Vehicle(), GroundTravel {
    override fun travel() {
        drive()
    }

    override fun drive() {
        print("Drive with battery power.")
    }
}