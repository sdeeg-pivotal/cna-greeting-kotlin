package io.pivotal.demo.kui

/**
 * Created by pivotal on 5/26/17.
 */

//Need to have default value for RestTemplate.getForObject to work
data class Greeting(val greeting: String = "default")