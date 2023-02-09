package com.epsi.tpci

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TpciApplication

fun main(args: Array<String>) {
	runApplication<TpciApplication>(*args)
}
