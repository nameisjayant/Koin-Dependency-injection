package di

import container.BaseApp
import data.*
import demo.Car
import demo.Engine
import demo.Wheel
import org.koin.core.qualifier.named
import org.koin.dsl.bind

import org.koin.dsl.module

val module = module {

    /*
    single scoped function means , only single instance of any component
     */

    single { HelloMsgData() }

    single { HelloServiceImplementation(get()) as HelloService}
    //single{DemoImp() as Demo}
   // single<Demo> { DemoImp()}
    single(named("default")) { DemoImp() } bind Demo::class
    single(named("test")) { DemoImp() } bind  Demo::class
    single { Main(get()) }

    /*
    factory scoped function means , it will give new instance each time
    you ask for...
     */
    factory{ Wheel() }
    factory { Engine() }
    factory { Car(get(),get())}

    /*
    get() function used to do constructor injection..
     */
}

val moduleB = module(createdAtStart = true,override = true){

    single(named("test")){DemoImp()} bind Demo::class

}
