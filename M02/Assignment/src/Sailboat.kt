class Sailboat : Vehicle(), WaterTravel {
    override fun travel() {
        sail()
    }

    override fun sail() {
        val name: String = javaClass.toString().replace("class", "")
        println("The$name moves with sails.")
    }
}