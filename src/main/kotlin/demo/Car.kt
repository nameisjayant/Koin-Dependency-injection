package demo

class Car constructor(
    private val wheel: Wheel,
    private val engine: Engine
) {

    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        println("Car is running")
    }
}