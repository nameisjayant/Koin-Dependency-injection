import container.BaseApp
import di.module
import di.moduleB
import org.koin.core.context.startKoin

fun main(){
    val baseApp = BaseApp()
    startKoin {
        printLogger()
        modules(module, moduleB)
    }

    baseApp.sayHello()
    baseApp.getCar()
    baseApp.demo()
    baseApp.demo1()
}