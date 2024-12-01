package org.example.helloproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloProjectApplication

fun main(args: Array<String>) {
    runApplication<HelloProjectApplication>(*args)
}

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello() = "Hello World + Test hook"
}
