package io.pivotal.demo.kregistry

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class KRegistryApplication

fun main(args: Array<String>) {
    SpringApplication.run(KRegistryApplication::class.java, *args)
}
