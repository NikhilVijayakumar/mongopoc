package com.nikhil.mongopoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongopocApplication

fun main(args: Array<String>) {
	runApplication<MongopocApplication>(*args)
}
