class Car : Vehicle(), GroundTravel {
    override fun travel() {
        drive()
    }

    override fun drive() {
        println("Drive with an engine")
    }
}