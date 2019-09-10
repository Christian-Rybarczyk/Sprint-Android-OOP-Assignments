class Boat : Vehicle(), WaterTravel {
    override fun sail() {
        println("Sail with a motor.")
    }

    override fun travel() {
        sail()
    }
}