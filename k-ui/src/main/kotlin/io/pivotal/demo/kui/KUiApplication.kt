package io.pivotal.demo.kui

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KUiApplication

fun main(args: Array<String>) {
    SpringApplication.run(KUiApplication::class.java, *args)
}
