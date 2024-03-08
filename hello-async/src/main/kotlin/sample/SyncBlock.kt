package org.example.sample

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}
fun main() {
  subA()
  subB()
}

private fun subA() {
  logger.debug { "start A" }
  Thread.sleep(1000)
  logger.debug { "end A" }
}

private fun subB() {
  logger.debug { "start B" }
  Thread.sleep(1000)
  logger.debug { "end B" }
}