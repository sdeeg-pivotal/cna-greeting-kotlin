package io.pivotal.demo.kservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by pivotal on 5/26/17.
 */

@RestController
class ServiceAPI(private val greeting: Greeting) {
    @GetMapping("/greeting")
    fun getTheGreeting() = greeting
}
