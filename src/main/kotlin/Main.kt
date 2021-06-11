import container.BaseApp
import di.module
import org.koin.core.context.startKoin

fun main(){
    startKoin {
        printLogger()
        modules(module)
    }
    BaseApp().sayHello()
    BaseApp().getCar()
}