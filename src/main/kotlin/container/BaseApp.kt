package container

import data.HelloService
import demo.Car
import demo.Engine
import demo.Wheel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@OptIn(KoinApiExtension::class)
class BaseApp : KoinComponent {

    val helloService by inject<HelloService>()
    val car by inject<Car>()
    val engine by inject<Engine>()
    val wheel by inject<Wheel>()

    fun getCar() = car.getCar()
    fun sayHello() = println(helloService.hello())
}