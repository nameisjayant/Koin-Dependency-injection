package data

interface Demo{
    fun demo()
}

class DemoImp : Demo{
    override fun demo()  = println("Hello interface")

}

class Main constructor(private val demo: Demo){
    fun demo() = demo.demo()
}