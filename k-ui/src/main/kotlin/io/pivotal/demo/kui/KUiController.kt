package io.pivotal.demo.kui

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * Created by pivotal on 5/26/17.
 */

@RestController
class KUiController(val restTemplate: RestTemplate, val fallbackGreeting: Greeting) {

    @GetMapping("/message")
    @HystrixCommand(fallbackMethod = "getMessageFallback")
    fun getMessage() = restTemplate.getForObject("http://cna-service/greeting", Greeting::class.java)

    fun getMessageFallback() = fallbackGreeting
}
