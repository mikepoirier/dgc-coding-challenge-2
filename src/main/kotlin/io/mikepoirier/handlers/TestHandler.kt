package io.mikepoirier.handlers

import io.mikepoirier.json
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class TestHandler {

    fun handleRequest(req: ServerRequest): Mono<ServerResponse> {

        val mono = Mono.just(mapOf(Pair("some", "value")))

        return ok()
            .json()
            .body(mono)
    }
}