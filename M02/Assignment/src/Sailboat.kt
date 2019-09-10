class Sailboat : Vehicle(), WaterTravel {
    override fun travel() {
        sail()
    }

    override fun sail() {
        println("Sail with sails")
    }
}