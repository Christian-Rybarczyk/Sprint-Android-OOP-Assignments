class Boat : Vehicle(), WaterTravel {
    override fun travel() {
        sail()
    }

    override fun sail() {
        val name: String = javaClass.toString().replace("class", "")
        println("The$name moves with a motor.")
    }
}