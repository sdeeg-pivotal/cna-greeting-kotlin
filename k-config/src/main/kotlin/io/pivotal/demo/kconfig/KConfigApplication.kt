package io.pivotal.demo.kconfig

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
open class KConfigApplication

fun main(args: Array<String>) {
    SpringApplication.run(KConfigApplication::class.java, *args)
}
