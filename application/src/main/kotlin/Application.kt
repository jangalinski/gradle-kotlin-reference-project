package com.github.jangalinski.refarch

import io.github.jangalinski.refarch.Choice
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

  @Bean
  fun runner() = CommandLineRunner { Choice.values().forEach { println(it) } }

}


fun main(args: Array<String>) {
  runApplication<Application>(*args)
}
