package io.pivotal.demo.kservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(KServiceApplication::class.java, *args)
}
