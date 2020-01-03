package io.rrlabs.kotlin.product

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class RrlabsProductKotlinApplication

fun main(args: Array<String>) {
	runApplication<RrlabsProductKotlinApplication>(*args)
}

