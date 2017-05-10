package io.mikepoirier

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ReactiveWebKotlinStarterApplication

fun main(args: Array<String>) {
    SpringApplication.run(ReactiveWebKotlinStarterApplication::class.java, *args)
}
