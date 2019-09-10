class Plane : Vehicle() ,AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly() {
        println("Fly with wings.")
    }
}