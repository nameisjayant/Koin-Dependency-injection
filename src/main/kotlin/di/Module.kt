package di

import container.BaseApp
import data.HelloMsgData
import data.HelloService
import data.HelloServiceImplementation
import demo.Car

import org.koin.dsl.module

val module = module {

    single { HelloMsgData() }

    single { HelloServiceImplementation(get()) as HelloService}

    single { Car()}

}
