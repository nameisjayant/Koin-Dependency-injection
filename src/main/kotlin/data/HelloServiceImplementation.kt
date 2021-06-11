package data

class HelloServiceImplementation constructor(private val helloMsgData: HelloMsgData) : HelloService {
    override fun hello(): String = helloMsgData.msg
}