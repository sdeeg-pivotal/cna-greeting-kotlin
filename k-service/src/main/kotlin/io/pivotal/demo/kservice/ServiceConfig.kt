package io.pivotal.demo.kservice

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by pivotal on 5/26/17.
 */

@Configuration
@EnableDiscoveryClient
class ServiceConfig() {

    @Value("\${app.greeting:Doh!}")
    private val greeting: String = "bar"

    @Bean
    fun greeting() = Greeting(greeting)
}