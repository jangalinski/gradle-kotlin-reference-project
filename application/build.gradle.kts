import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version Versions.kotlin
  kotlin("plugin.spring") version Versions.kotlin
  id("org.springframework.boot") version Versions.springBoot
}

dependencies {
  compile("org.springframework.boot:spring-boot-starter:${Versions.springBoot}")

  compile(kotlin("stdlib-jdk8"))
  compile(kotlin("reflect"))
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = Versions.java
    //  freeCompilerArgs = kotlin.collections.listOf("-Xjsr305=strict")
  }
}