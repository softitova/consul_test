import com.ecwid.consul.v1.ConsulClient
import com.ecwid.consul.v1.agent.model.NewService

/**
 * Created by Titova Sophia on 10.01.18.
 */


fun main(args: Array<String>) {
    val consulClient = ConsulClient("172.20.209.23", 8500)
    val newService = NewService()
    newService.id = "myapp_0100500"
    newService.name = "myapp"
    newService.tags = listOf("EU-West", "EU-East")
    newService.port = 7000
    newService.address = "127.9.9.9"
    consulClient.agentServiceRegister(newService)
}