package io.pivotal.demo.kui

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

/**
 * Created by pivotal on 5/26/17.
 */

@Configuration
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableZuulProxy
class KUiAppConfig {

    @Bean
    @LoadBalanced
    fun restTemplate() = RestTemplate()

    @Bean
    fun fallbackGreeting() = Greeting("Don't Panic!")
}