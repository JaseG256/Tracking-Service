package com.msa.trackingservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrackingServiceApplication

fun main(args: Array<String>) {
	runApplication<TrackingServiceApplication>(*args)
}
