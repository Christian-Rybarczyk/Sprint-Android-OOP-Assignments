class Helicopter : Vehicle(), AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly() {
        val name: String = javaClass.toString().replace("class", "")
        println("The$name flies with rotors.")
    }
}