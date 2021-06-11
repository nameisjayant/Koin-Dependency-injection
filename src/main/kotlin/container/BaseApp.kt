package container

import data.Demo
import data.DemoImp
import data.HelloService
import data.Main
import demo.Car
import demo.Engine
import demo.Wheel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject
import org.koin.core.qualifier.named

@OptIn(KoinApiExtension::class)
class BaseApp : KoinComponent {


    val helloService by inject<HelloService>()
    val car by inject<Car>()
    val engine by inject<Engine>()
    val wheel by inject<Wheel>()

    fun getCar() = car.getCar()
    fun sayHello() = println(helloService.hello())

    /*
    qualifier..
    lazily inject koin instance..
     */
    val demo by inject<Demo>(qualifier = named("default"))
    val demo1 by inject<Demo>(qualifier = named("test"))
    val main by inject<Main>()

    // eager inject koin instance
    val demoImp:DemoImp = get()


    fun demo1() = demo1.demo()
    fun demo() = demo.demo()
}