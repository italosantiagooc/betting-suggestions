package br.com.gotips.betting_suggestions

import io.github.cdimascio.dotenv.Dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BettingSuggestionsApplication

fun main(args: Array<String>) {
	val dotenv = Dotenv.configure().load()
	dotenv.entries().forEach { (key, value) ->
		System.setProperty(key, value)
	}
	runApplication<BettingSuggestionsApplication>(*args)
}
