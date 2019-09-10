class Helicopter : Vehicle(), AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly() {
        println("Fly with rotors")
    }
}