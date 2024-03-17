plugins {
  kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("ch.qos.logback:logback-classic:1.4.11")
  implementation("io.github.microutils:kotlin-logging:3.0.5")
  implementation("io.projectreactor:reactor-core:3.5.8")
  testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
  useJUnitPlatform()
}
kotlin {
  jvmToolchain(17)
}