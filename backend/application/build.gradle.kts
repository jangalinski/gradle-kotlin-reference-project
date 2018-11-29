plugins {
  kotlin("jvm")
  kotlin("plugin.spring") version Versions.kotlin
  id("org.springframework.boot") version Versions.springBoot
}

dependencies {
  compile("org.springframework.boot:spring-boot-starter:2.1.0.RELEASE")

  compile(kotlin("stdlib-jdk8"))
  compile(kotlin("reflect"))
}
