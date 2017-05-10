package io.mikepoirier.web

import io.mikepoirier.handlers.TestHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes(val testHandler: TestHandler) {

    @Bean
    fun apiRoutes() = router {
        (accept(MediaType.APPLICATION_JSON) and "/api").nest {
            "/endpoint".nest {
                GET("/", testHandler::handleRequest)
                POST("/", testHandler::handleRequest)
                PUT("/", testHandler::handleRequest)
                DELETE("/", testHandler::handleRequest)
            }
        }
    }
}